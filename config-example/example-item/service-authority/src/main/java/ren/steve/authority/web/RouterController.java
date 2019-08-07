package ren.steve.authority.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ren.steve.authority.pojo.Router;
import ren.steve.authority.service.RouterService;
import ren.steve.common.enums.RouterExceptionEnum;
import ren.steve.common.exception.ExampleException;
import ren.steve.common.vo.ResultVo;

/**
 * @Author : 刘国家
 * @Date : 2019-08-07 18:40
 * @Description :
 * @ModifiedBy :
 */

@RestController
@RequestMapping("router")
public class RouterController {

  @Autowired
  private RouterService routerService;

  @PostMapping("list")
  public ResponseEntity<ResultVo> queryRouterListByAuthority ( @ModelAttribute Router router ) {

    if ( router.getId() == null ) {
      throw new ExampleException(RouterExceptionEnum.ROUTER_ID_NOT_FOUND);
    }
    return ResponseEntity.ok(routerService.queryRouterListByAuthority(router.getId()));
  }


}
