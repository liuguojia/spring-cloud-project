package ren.steve.authority.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;
/**
 * @Author : 刘国家
 * @Date : 2019-08-07 18:37
 * @Description :
 * @ModifiedBy :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_router")
public class Router implements Serializable {

  private static final long serialVersionUID = 5231134212346077681L;

  @Id
  @KeySql(useGeneratedKeys = true)
  private Integer id;
  private Boolean exact;
  private String path;
  private Boolean hideInMenu;
  private Integer page;
  private Integer routes;
  private Integer children;
  private String redirect;
  private String name;
  private String locale;
  private String icon;
  private String authority;


}