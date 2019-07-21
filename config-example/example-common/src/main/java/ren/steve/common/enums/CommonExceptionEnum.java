package ren.steve.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 15:52
 * @Description :
 * @ModifiedBy :
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum CommonExceptionEnum {

  ROUTER_NOT_FOUND(404, "路由访问错误"),
  PARAMS_NOT_FOUND(404, "获取参数错误"),
  ACCOUNT_ID_NOT_FOUND(404, "账户ID不能为空"),

  ;
  private Integer code;
  private String message;
}
