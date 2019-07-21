package ren.steve.common.vo;

import lombok.Data;
import ren.steve.common.enums.CommonExceptionEnum;

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

  public ExceptionResult ( CommonExceptionEnum cem ) {
    this.status = cem.getCode();
    this.message = cem.getMessage();
    this.timestamp = System.currentTimeMillis();
  }

}
