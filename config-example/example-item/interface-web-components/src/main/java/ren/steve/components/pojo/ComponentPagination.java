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
 * @Date : 2019-08-05 16:38
 * @Description :
 * @ModifiedBy :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_pagination")
public class ComponentPagination implements Serializable {

  private static final long serialVersionUID = 5231134212346077681L;

  @Id
  @KeySql(useGeneratedKeys = true)
  private Integer id;
  private Integer current;
  private Integer defaultCurrent;
  private Integer defaultPageSize;
  private Boolean disabled;
  private Boolean hideOnSinglePage;
  private String itemRender;
  private Integer pageSize;
  private String pageSizeOptions;
  private Boolean showLessItems;
  private Boolean showQuickJumper;
  private Boolean showSizeChanger;
  private String showTotal;
  private Boolean simple;
  private Integer size;
  private Long total;
  private Integer onChange;
  private Integer onShowSizeChange;

}
