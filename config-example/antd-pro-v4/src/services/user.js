import request from '@/utils/request';

/**
 * @Author : 刘国家
 * @Date : 2019-07-12 14:57
 * @Description :
 * @ModifiedBy :
 * @param null
 */

export async function queryAccountList(params) {
  return request('/api/router-service/account/list', {
    method: 'POST',
    data: params,
  });
}

export async function queryCurrentAccount(params) {
  return request('/api/router-service/account/current', {
    method: 'POST',
    data: params,
  });
}

export async function queryAuthorityByCurrentAccount(params) {
  return request('/api/router-service/authority/currentAuthority', {
    method: 'POST',
    data: params,
  });
}
