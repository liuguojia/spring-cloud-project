import { parse, stringify } from 'qs';
import { routerRedux } from 'dva/router';
import { queryRemoteMenuData, queryPageConfig } from '@/services/api'

export function getPageQuery() {
  return parse(window.location.href.split('?')[1]);
}

// hideInMenu:true
const parseMenu = (menuData) => {
  if ( menuData ) {
    const parentMenu = menuData.filter(menu => !menu.routes)
    const childMenu = menuData.filter(menu => menu.routes)
    parentMenu.map(parent => {
      parent.routes = []
      parent.children = []
      childMenu.map(child => {
        if ( parent.id === child.routes ) {
          parent.routes.push(child)
          parent.children.push(child)
          child.icon = null
          delete child.routes
          delete child.children
        }
      })
    })
    return parentMenu
  }
}


const Model = {
  namespace: 'menu',
  state: {
    menuData: [],

  },
  effects: {
    *fetchRemoteMenuData(payload, { call, put }) {
      const response = yield call(queryRemoteMenuData, payload.params);
      const menuData = parseMenu(response.list)
      yield put({
        type: 'saveMenuData',
        payload: menuData,
      });
    },

  },
  reducers: {
    saveMenuData(state, { payload }) {
      return {
        ...state,
        menuData: payload
      };
    },

  },

};
export default Model;
