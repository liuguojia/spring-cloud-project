/**
 * @Author : 刘国家
 * @Date : 2019-08-05 17:49
 * @Description :
 * @ModifiedBy :
 */

import { parse, stringify } from 'qs';
import { routerRedux } from 'dva/router';
import { queryCurrentTable } from '../services/components';

export function getPageQuery() {
  return parse(window.location.href.split('?')[1]);
}

const Model = {
  namespace: 'components',
  state: {
    table: null,
    component: null,
  },
  effects: {
    *queryCurrentTable(payload, { call, put }) {
      const response = yield call(queryCurrentTable, payload.params);
      yield put({
        type: 'saveStateData',
        payload: response,
      });
    },
  },
  reducers: {
    saveStateData(state, { payload }) {
      return {
        ...state,
        component: payload.data,
      };
    },
  },
};
export default Model;
