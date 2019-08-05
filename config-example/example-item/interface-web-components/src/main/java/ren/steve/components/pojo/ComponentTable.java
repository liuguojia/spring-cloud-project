package ren.steve.components.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @Author : 刘国家
 * @Date : 2019-08-05 16:02
 * @Description :
 * @ModifiedBy :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_table")
public class ComponentTable implements Serializable {

  private static final long serialVersionUID = 5231134212346077681L;

  @Id
  @KeySql(useGeneratedKeys = true)
  private Integer id;
  private Boolean bordered;
  private String childrenColumnName;
  private List<ComponentTableColumn> columns;
  private String components;
  private String dataSource;
  private String defaultExpandAllRows;
  private Boolean defaultExpandedRowKeys;
  private Boolean expandedRowKeys;
  private String expandedRowRender;
  private String expandIcon;
  private Boolean expandRowByClick;
  private String footer;
  private Boolean indentSize;
  private String loading;
  private String locale;
  private Set<ComponentPagination> pagination;
  private String rowClassName;
  private String rowKey;
  private List<ComponentRowSelection> rowSelection;
  private Integer scroll;
  private String showHeader;
  private String size;
  private String title;
  private String onChange;
  private String onExpand;
  private String onExpandedRowsChange;
  private String onHeaderRow;
  private String onRow;

}
