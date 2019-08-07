package ren.steve.authority.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ren.steve.authority.mapper.RouterMapper;
import ren.steve.common.vo.ResultVo;

/**
 * @Author : 刘国家
 * @Date : 2019-08-07 18:41
 * @Description :
 * @ModifiedBy :
 */

@Service
public class RouterService {

  @Autowired
  private RouterMapper routerMapper;

  public ResultVo queryRouterListByAuthority ( Integer id ) {
    ResultVo resultVo = new ResultVo();





    return resultVo;
  }
}
