package ren.steve.authority.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author : 刘国家
 * @Date : 2019-08-05 18:35
 * @Description :
 * @ModifiedBy :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorityQuery {

  private Integer id;
  private String title;
  private String code;
  private Integer level;


}
