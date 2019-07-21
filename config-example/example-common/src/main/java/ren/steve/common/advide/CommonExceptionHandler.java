package ren.steve.common.advide;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ren.steve.common.enums.CommonExceptionEnum;
import ren.steve.common.exception.ExampleException;
import ren.steve.common.vo.ExceptionResult;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 15:25
 * @Description :
 * @ModifiedBy :
 */
@ControllerAdvice
public class CommonExceptionHandler {

  @ExceptionHandler(ExampleException.class)
  public ResponseEntity<ExceptionResult> handlerException ( ExampleException ee ) {
    CommonExceptionEnum cee = ee.getCommonExceptionEnum();
    return ResponseEntity.status(cee.getCode()).body((new ExceptionResult(cee)));
  }

}
