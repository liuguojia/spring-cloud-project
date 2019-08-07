package ren.steve.authority.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ren.steve.authority.AuthorityParams;
import ren.steve.authority.mapper.AuthorityMapper;
import ren.steve.authority.pojo.Authority;
import ren.steve.authority.query.AuthorityQuery;
import ren.steve.common.vo.ResultVo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : 刘国家
 * @Date : 2019-08-05 18:39
 * @Description :
 * @ModifiedBy :
 */
@Service
public class AuthorityService {

  @Autowired
  private AuthorityMapper authorityMapper;

  public ResultVo queryAuthority ( AuthorityQuery authorityQuery ) {

    ResultVo resultVo = new ResultVo();

    Authority result = authorityMapper.selectByPrimaryKey(authorityQuery.getId());
    System.out.println("authority : " + result);

    resultVo.setTimestamp(System.currentTimeMillis());
    resultVo.setData(result);
    resultVo.setStatus(0);
    resultVo.setMessage("Query Authority Success.");

    return resultVo;
  }

  public ResultVo insertAuthority ( AuthorityParams authorityParams ) {
    ResultVo resultVo = new ResultVo();
    // Authority authority = new Authority();
    // String[] codeArray = authorityParams.getCode().split(",");
    // List<String> codeList = new ArrayList<String>();
    //
    // for ( String s : codeArray ) {
    //   codeList.add(s);
    // }
    //
    // authority.setTitle(authorityParams.getTitle());
    // authority.setLevel(authorityParams.getLevel());
    // authority.setCode(codeList);
    //
    // System.out.println("authorityParams : " + authorityParams);
    // System.out.println("authority : " + authority);
    //
    // int result = authorityMapper.insert(authority);
    //
    // resultVo.setTimestamp(System.currentTimeMillis());
    // resultVo.setStatus(0);
    // resultVo.setMessage("Insert Authority Success.");
    return resultVo;
  }
}
