package ren.steve.common.vo;

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
 * @Date : 2019-07-13 18:34
 * @Description :
 * @ModifiedBy :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_page")
public class PageComponent implements Serializable {
  private static final long serialVersionUID = 5231134212346077681L;

  @Id
  @KeySql(useGeneratedKeys = true)
  private Long id;
  private String title;
  private Long searchComponent;
  private Long formComponent;
  private Long tableComponent;
  private Long pageHeadComponent;
  private Long statComponent;
  private Integer type;
  private Boolean status;
  private Date gmtCreate;


}
