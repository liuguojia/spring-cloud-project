package ren.steve.common.advide;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ren.steve.common.enums.RouterExceptionEnum;
import ren.steve.common.exception.ExampleException;
import ren.steve.common.vo.ExceptionResult;

/**
 * @Author : 刘国家
 * @Date : 2019-08-07 12:04
 * @Description :
 * @ModifiedBy :
 */

@ControllerAdvice
public class RouterExceptionHandler {

  @ExceptionHandler(ExampleException.class)
  public ResponseEntity<ExceptionResult> handlerException ( ExampleException ee ) {
    RouterExceptionEnum ree = ee.getRouterExceptionEnum();
    return ResponseEntity.status(ree.getCode()).body((new ExceptionResult(ree)));
  }

}
