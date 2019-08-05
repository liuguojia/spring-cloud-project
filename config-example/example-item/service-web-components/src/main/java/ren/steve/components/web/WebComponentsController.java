package ren.steve.components.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ren.steve.common.enums.CommonExceptionEnum;
import ren.steve.common.exception.ExampleException;
import ren.steve.common.vo.ResultVo;
import ren.steve.components.query.ComponentTableQuery;
import ren.steve.components.service.ComponentTableService;

/**
 * @Author : 刘国家
 * @Date : 2019-08-05 17:19
 * @Description :
 * @ModifiedBy :
 */


@RestController
@RequestMapping("web-components")
public class WebComponentsController {

  @Autowired
  private ComponentTableService componentTableService;

  @PostMapping("table")
  public ResponseEntity<ResultVo> queryTable ( @ModelAttribute ComponentTableQuery componentTableQuery ) {
    System.out.println("componentTableQuery : " + componentTableQuery);
    if ( componentTableQuery.getId() == null ) {
      throw new ExampleException(CommonExceptionEnum.COMPONENT_ID_NOT_FOUND);
    }
    return ResponseEntity.ok(componentTableService.queryTable(componentTableQuery));
  }



}
