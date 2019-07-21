
import React, { useEffect } from 'react';
import Link from 'umi/link';
import { connect } from 'dva';
import InitializesPage from './InitializesPage'



const InitializesModel = props => {
  const { dispatch, match, menu, user, page } = props;

  /**
   * constructor
   */
  useEffect(() => {
    if ( menu.menuData.length !== 0 ) {
      let pageCode = 0;
      menu.menuData.map(item => {
        if ( `/${match.params.model}` === item.path ) {
          item.routes.map(child => {
            if ( `/${match.params.model}/${match.params.page}` === child.path ) {
              pageCode = child.page
            }
          })
        }
      })
      if (dispatch) {
        dispatch({
          type: 'page/fetchPageComponentByMenu',
          params : {
            id : pageCode
          }
        });


      }
    }

  }, [menu]);

  /**
   * init variables
   */
  return (
    <InitializesPage {...props}/>
  );

};

export default connect(({ global, menu, user, page }) => ({
  collapsed: global.collapsed,
  user, menu, page
}))(InitializesModel);

