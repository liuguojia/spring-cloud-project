package ren.steve.common.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 13:43
 * @Description :
 * @ModifiedBy :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryVo implements Serializable {

  private static final long serialVersionUID = 5231134212346077681L;

  private Integer pageNum;
  private Integer pageSize;
  private String searchField;
  private String sort;

}
