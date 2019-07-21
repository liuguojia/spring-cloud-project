package ren.steve.account.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 17:12
 * @Description :
 * @ModifiedBy :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_account")
public class Account implements Serializable {

  private static final long serialVersionUID = 5231134212346077681L;

  @Id
  @KeySql(useGeneratedKeys = true)
  private Long id;
  private String uid;
  private String name;
  private String password;
  private String nickname;
  private Long authority;
  private String phone;
  private String email;
  private String province;
  private String city;
  private String district;
  private String address;
  private String tags;
  private String avatar;
  private Boolean gender;
  private Integer status;
  private Date gmtCreate;
  private Date gmtUpdate;
  private Date gmtLastLogon;
  private Date gmtBirthday;

}