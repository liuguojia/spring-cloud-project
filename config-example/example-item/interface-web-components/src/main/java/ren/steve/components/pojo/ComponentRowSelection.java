package ren.steve.components.pojo;

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
 * @Date : 2019-08-05 16:37
 * @Description :
 * @ModifiedBy :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_row_selection")
public class ComponentRowSelection implements Serializable {

  private static final long serialVersionUID = 5231134212346077681L;

  @Id
  @KeySql(useGeneratedKeys = true)
  private Integer id;
  private Integer columnWidth;
  private String columnTitle;
  private Boolean fixed;
  private String getCheckboxProps;
  private Boolean hideDefaultSelections;
  private String selectedRowKeys;
  private List<ComponentSelection> selections;
  private String type;
  private String onChange;
  private String onSelect;
  private String onSelectAll;
  private String onSelectInvert;






}
