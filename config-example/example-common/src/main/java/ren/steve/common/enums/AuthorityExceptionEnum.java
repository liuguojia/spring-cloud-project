package ren.steve.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
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
public enum AuthorityExceptionEnum {

  AUTHORITY_NOT_FOUND(404, "权限没有找到"),
  AUTHORITY_ID_NOT_FOUND(404, "权限ID不能为空"),





  ;
  private Integer code;
  private String message;


}
