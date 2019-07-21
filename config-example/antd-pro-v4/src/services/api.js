
import { stringify } from 'qs';
import request from '@/utils/request';

/**
 * @Author : 刘国家
 * @Date : 2019-07-12 15:01
 * @Description :
 * @ModifiedBy :
 * @Function login
 * @Function fetchArticles
 * @Function fetchAuthorityByCurrentUser
 * @Function fetchRemoteMenuData
 */

export async function login ( params ) {
  return request('http://127.0.0.1:5555/api/router-service/account/login', {
    method: 'POST',
    data: params,
  });
}


export async function  queryRemoteMenuData ( params ) {
  return request('http://127.0.0.1:5555/api/router-service/router/list', {
    method: 'POST',
    data: params,
  });
}

export async function  queryPageConfig ( params ) {
  return request('http://127.0.0.1:5555/api/router-service/page/component', {
    method: 'POST',
    data: params,
  });
}



