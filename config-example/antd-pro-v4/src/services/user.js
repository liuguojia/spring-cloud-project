import request from '@/utils/request';

/**
 * @Author : 刘国家
 * @Date : 2019-07-12 14:57
 * @Description :
 * @ModifiedBy :
 * @param null
 */

export async function queryAccountList(params) {
  return request('/api/item-account/account/list', {
    method: 'POST',
    requestType: 'form',
    data: params,
  });
}

export async function queryCurrentAccount(params) {
  return request('/api/item-account/account/current', {
    method: 'POST',
    requestType: 'form',
    data: params,
  });
}

export async function queryAuthorityByCurrentAccount(params) {
  return request('/api/item-authority/authority/currentAuthority', {
    method: 'POST',
    requestType: 'form',
    data: params,
  });
}
