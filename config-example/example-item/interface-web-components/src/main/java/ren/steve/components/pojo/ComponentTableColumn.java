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
 * @Date : 2019-08-05 16:02
 * @Description :
 * @ModifiedBy :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_table_column")
public class ComponentTableColumn implements Serializable {

  private static final long serialVersionUID = 5231134212346077681L;

  @Id
  @KeySql(useGeneratedKeys = true)
  private Integer id;
  private String align;
  private String className;
  private Integer colSpan;
  private String dataIndex;
  private String defaultSortOrder;
  private String filterDropdown;
  private Boolean filterDropdownVisible;
  private Boolean filtered;
  private String filteredValue;
  private String filter_icon;
  private Boolean filterMultiple;
  private String filters;
  private Boolean fixed;
  private String key;
  private String render;
  private Boolean sorter;
  private String sortOrder;
  private String sortDirections;
  private String title;
  private Integer width;
  private String onCell;
  private String onFilter;
  private String onFilterDropdownVisibleChange;
  private String onHeaderCell;

}
