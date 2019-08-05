package ren.steve.authority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author : 刘国家
 * @Date : 2019-08-05 19:28
 * @Description :
 * @ModifiedBy :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorityParams {

  private String title;
  private String code;
  private Integer level;

}
