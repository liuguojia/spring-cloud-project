import { stringify } from 'qs';
import request from '@/utils/request';

/**
 * @Author : 刘国家
 * @Date : 2019-08-05 17:49
 * @Description :
 * @ModifiedBy :
 */

export async function queryCurrentTable(params) {
  return request('/api/item-web-components/web-components/table', {
    method: 'POST',
    data: params,
  });
}
