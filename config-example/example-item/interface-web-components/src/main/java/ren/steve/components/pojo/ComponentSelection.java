package ren.steve.components.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author : 刘国家
 * @Date : 2019-08-05 16:37
 * @Description :
 * @ModifiedBy :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_selection")
public class ComponentSelection implements Serializable {

  private static final long serialVersionUID = 5231134212346077681L;

  @Id
  @KeySql(useGeneratedKeys = true)
  private Integer id;
  private String key;
  private String text;
  private String onSelect;

}
