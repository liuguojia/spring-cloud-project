/**
 * Ant Design Pro v4 use `@ant-design/pro-layout` to handle Layout.
 * You can view component api by:
 * https://github.com/ant-design/ant-design-pro-layout
 */
import ProLayout from '@ant-design/pro-layout';
import React, { useEffect } from 'react';
import Link from 'umi/link';
import { connect } from 'dva';
import { formatMessage } from 'umi-plugin-react/locale';
import RightContent from '@/components/GlobalHeader/RightContent';
import { isAntDesignPro } from '@/utils/utils';


const footerRender = (_, defaultDom) => {
  if (!isAntDesignPro()) {
    return defaultDom;
  }

  return (
    <>

    </>
  );
};

const BasicLayout = props => {
  const { dispatch, children, settings, menu, user } = props;
  /**
   * constructor
   */
  useEffect(() => {
    if (dispatch) {
      dispatch({
        type: 'user/fetchCurrentAccount',
        params : {
          id : 1
        }
      }).then(res => {
        if ( res.status === 0 ) {
          dispatch({
            type : 'menu/fetchRemoteMenuData',
            params : {
              authority : res.data.code
            }
          })
        }
      })
      dispatch({
        type: 'settings/getSetting',
      });
    }
  }, []);
  /**
   * init variables
   */
  const handleMenuCollapse = payload => dispatch && dispatch({
    type: 'global/changeLayoutCollapsed',
    payload,
  });

  /**
   * @Author : 刘国家
   * @Date : 2019-07-13 13:48
   * @Description : init Page Component
   * @ModifiedBy :
   * @param props 路由数据
   * @param children 404 错误页面
   */

  return (
    <ProLayout
      menuData={menu.menuData}
      logo={'https://imgvip.meishubao.com/vip/1v4/logoxiaobnake.png'}
      onCollapse={handleMenuCollapse}
      menuItemRender={(menuItemProps, defaultDom) => {
        if (menuItemProps.isUrl) {
          return defaultDom;
        }
        return <Link to={menuItemProps.path}>{defaultDom}</Link>;
      }}
      breadcrumbRender={(routers = []) => [
        {
          path: '/',
          breadcrumbName: formatMessage({
            id: 'menu.home',
            defaultMessage: 'Home',
          }),
        },
        ...routers,
      ]}
      itemRender={(route, params, routes, paths) => {
        const first = routes.indexOf(route) === 0;
        return first ? (
          <Link to={paths.join('/')}>{route.breadcrumbName}</Link>
        ) : (
          <span>{route.breadcrumbName}</span>
        );
      }}
      footerRender={footerRender}
      formatMessage={formatMessage}
      rightContentRender={rightProps => <RightContent {...rightProps} />}
      {...settings}>
      { children }
    </ProLayout>
  );
};

export default connect(({ global, settings, menu, user }) => ({
  collapsed: global.collapsed,
  settings, menu, user
}))(BasicLayout);
