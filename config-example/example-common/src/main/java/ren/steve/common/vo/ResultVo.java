package ren.steve.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 19:08
 * @Description :
 * @ModifiedBy :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo<T> implements Serializable {

  private static final long serialVersionUID = 5231134212346077681L;

  private Integer status;
  private String message;
  private Object data;
  private Long timestamp;
  private Long total;
  private Integer pageNum;
  private Integer pageSize;
  private List<T> list;

}
