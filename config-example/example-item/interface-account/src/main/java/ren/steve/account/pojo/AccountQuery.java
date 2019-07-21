package ren.steve.account.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 20:49
 * @Description :
 * @ModifiedBy :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountQuery{

  private Integer pageNum;
  private Integer pageSize;
  private String sort;
  private Long id;
  private String uid;
  private String name;
  private String phone;
  private Integer authority;
  private Integer status;
  private String fuzzy;


}
