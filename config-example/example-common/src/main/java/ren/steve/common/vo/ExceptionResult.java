package ren.steve.common.vo;

import lombok.Data;
import ren.steve.common.enums.*;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 15:27
 * @Description :
 * @ModifiedBy :
 */
@Data
public class ExceptionResult {

  private Integer status;
  private String message;
  private Long timestamp;

  public ExceptionResult ( CommonExceptionEnum cee ) {
    this.status = cee.getCode();
    this.message = cee.getMessage();
    this.timestamp = System.currentTimeMillis();
  }

  public ExceptionResult ( AccountExceptionEnum aee ) {
    this.status = aee.getCode();
    this.message = aee.getMessage();
    this.timestamp = System.currentTimeMillis();
  }

  public ExceptionResult ( RouterExceptionEnum ree ) {
    this.status = ree.getCode();
    this.message = ree.getMessage();
    this.timestamp = System.currentTimeMillis();
  }

  public ExceptionResult ( AuthorityExceptionEnum aee ) {
    this.status = aee.getCode();
    this.message = aee.getMessage();
    this.timestamp = System.currentTimeMillis();
  }

  public ExceptionResult ( WebComponentExceptionEnum wcee ) {
    this.status = wcee.getCode();
    this.message = wcee.getMessage();
    this.timestamp = System.currentTimeMillis();
  }

}
