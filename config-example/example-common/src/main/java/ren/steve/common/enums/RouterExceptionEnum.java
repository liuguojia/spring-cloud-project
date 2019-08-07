package ren.steve.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author : 刘国家
 * @Date : 2019-08-07 12:14
 * @Description :
 * @ModifiedBy :
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum  RouterExceptionEnum {

  ROUTER_NOT_FOUND(404, "路由访问错误"),

  ;
  private Integer code;
  private String message;


}
