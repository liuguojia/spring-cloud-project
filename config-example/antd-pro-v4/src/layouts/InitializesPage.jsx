
import React, { useState, useEffect } from 'react';
import Link from 'umi/link';
import { connect } from 'dva';
import { Table } from 'antd'


const InitializesPage = props => {
  const { dispatch, match, menu, user, page } = props;

  /**
   * constructor
   */
  useEffect(() => {
    if (dispatch) {


    }
  }, [page]);
  /**
   * init variables
   */


  return (
    <div style={{background : '#FFF'}}>
      <Table { ...page.tableConfig } dataSource={page.dataSource} />
    </div>
  );
};

export default connect(({ global, menu, user, page }) => ({
  collapsed: global.collapsed,
  menu, user, page
}))(InitializesPage);

