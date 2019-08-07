package ren.steve.common.enums;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 15:16
 * @Description : Account 异常字典
 * @ModifiedBy :
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum AccountExceptionEnum {

  ACCOUNT_NOT_FOUND(404, "账户没有找到"),
  ACCOUNT_ID_NOT_FOUND(404, "账户ID不能为空"),





  ;
  private Integer code;
  private String message;


}
