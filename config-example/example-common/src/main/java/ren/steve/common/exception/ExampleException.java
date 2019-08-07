package ren.steve.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ren.steve.common.enums.AccountExceptionEnum;
import ren.steve.common.enums.CommonExceptionEnum;
import ren.steve.common.enums.RouterExceptionEnum;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 15:16
 * @Description :
 * @ModifiedBy :
 */
@Getter
public class ExampleException extends RuntimeException{

  private CommonExceptionEnum commonExceptionEnum;
  private AccountExceptionEnum accountExceptionEnum;
  private RouterExceptionEnum routerExceptionEnum;

  public ExampleException ( CommonExceptionEnum commonExceptionEnum  ) {
    this.commonExceptionEnum = commonExceptionEnum;
  }
  public ExampleException ( AccountExceptionEnum accountExceptionEnum  ) {
    this.accountExceptionEnum = accountExceptionEnum;
  }
  public ExampleException ( RouterExceptionEnum routerExceptionEnum  ) {
    this.routerExceptionEnum = routerExceptionEnum;
  }



}
