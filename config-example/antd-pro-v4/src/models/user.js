import {
  queryCurrentAccount,
  queryAccountList,
  queryAuthorityByCurrentAccount
} from '@/services/user';



const UserModel = {
  namespace: 'user',
  state: {
    currentUser: {},
    currentAuthority : []
  },
  effects: {
    *fetchAccountList(payload, { call, put }) {
      const response = yield call(queryAccountList, payload.params);
      yield put({
        type: 'save',
        payload: response,
      });
    },

    *fetchCurrentAccount(payload, { call, put }) {
      const responseAccount = yield call(queryCurrentAccount, payload.params);
      const responseAuthority = yield call(queryAuthorityByCurrentAccount, {id : responseAccount.data.authority});
      yield put({
        type: 'saveCurrentAccount',
        payload: responseAccount.data,
      });
      yield put({
        type: 'saveCurrentAccountAuthority',
        payload: responseAuthority.data,
      });
      return responseAuthority
    },
    *fetchAuthorityByCurrentAccount(payload, { call, put }) {


    },
  },
  reducers: {
    saveCurrentAccount(state, action) {
      return {
        ...state,
        currentUser: action.payload || {}
      };
    },
    saveCurrentAccountAuthority(state, action) {
      return {
        ...state,
        currentAuthority: action.payload || []
      };
    },

    changeNotifyCount(
      state = {
        currentUser: {},
      },
      action,
    ) {
      return {
        ...state,
        currentUser: {
          ...state.currentUser,
          notifyCount: action.payload.totalCount,
          unreadCount: action.payload.unreadCount,
        },
      };
    },
  },
};
export default UserModel;
