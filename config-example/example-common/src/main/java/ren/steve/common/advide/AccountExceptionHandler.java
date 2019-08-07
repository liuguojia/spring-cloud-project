package ren.steve.common.advide;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ren.steve.common.enums.AccountExceptionEnum;
import ren.steve.common.enums.CommonExceptionEnum;
import ren.steve.common.exception.ExampleException;
import ren.steve.common.vo.ExceptionResult;

/**
 * @Author : 刘国家
 * @Date : 2019-08-07 12:04
 * @Description :
 * @ModifiedBy :
 */

@ControllerAdvice
public class AccountExceptionHandler {

  @ExceptionHandler(ExampleException.class)
  public ResponseEntity<ExceptionResult> handlerException ( ExampleException ee ) {
    AccountExceptionEnum aee = ee.getAccountExceptionEnum();
    return ResponseEntity.status(aee.getCode()).body((new ExceptionResult(aee)));
  }

}
