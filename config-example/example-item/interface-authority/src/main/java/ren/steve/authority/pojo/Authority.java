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
 * @Date : 2019-08-05 18:31
 * @Description :
 * @ModifiedBy :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_authority")
public class Authority implements Serializable {

  private static final long serialVersionUID = 5231134212346077681L;

  @Id
  @KeySql(useGeneratedKeys = true)
  private Integer id;
  private String title;
  private List<String> code;
  private Integer level;


}
