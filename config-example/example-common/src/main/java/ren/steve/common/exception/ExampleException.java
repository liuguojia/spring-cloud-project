package ren.steve.common.exception;

import lombok.Getter;
import ren.steve.common.enums.*;

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
  private AuthorityExceptionEnum authorityExceptionEnum;
  private WebComponentExceptionEnum webComponentExceptionEnum;

  public ExampleException ( CommonExceptionEnum commonExceptionEnum  ) {
    this.commonExceptionEnum = commonExceptionEnum;
  }
  public ExampleException ( AccountExceptionEnum accountExceptionEnum  ) {
    this.accountExceptionEnum = accountExceptionEnum;
  }
  public ExampleException ( RouterExceptionEnum routerExceptionEnum  ) {
    this.routerExceptionEnum = routerExceptionEnum;
  }
  public ExampleException ( AuthorityExceptionEnum authorityExceptionEnum  ) {
    this.authorityExceptionEnum = authorityExceptionEnum;
  }
  public ExampleException ( WebComponentExceptionEnum webComponentExceptionEnum  ) {
    this.webComponentExceptionEnum = webComponentExceptionEnum;
  }

}
