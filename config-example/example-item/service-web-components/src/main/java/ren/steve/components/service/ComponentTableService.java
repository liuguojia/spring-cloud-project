package ren.steve.components.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ren.steve.common.vo.ResultVo;
import ren.steve.components.mapper.ComponentTableMapper;
import ren.steve.components.pojo.ComponentTable;
import ren.steve.components.query.ComponentTableQuery;

/**
 * @Author : 刘国家
 * @Date : 2019-08-05 17:29
 * @Description :
 * @ModifiedBy :
 */
@Service
public class ComponentTableService {

  @Autowired
  private ComponentTableMapper componentTableMapper;

  public ResultVo queryTable ( ComponentTableQuery componentTableQuery ) {
    ResultVo resultVo = new ResultVo();

    ComponentTable result = componentTableMapper.selectByPrimaryKey(componentTableQuery.getId());

    resultVo.setTimestamp(System.currentTimeMillis());
    resultVo.setData(result);
    resultVo.setStatus(0);
    resultVo.setMessage("Query ComponentTable Success.");

    return resultVo;
  }
}
