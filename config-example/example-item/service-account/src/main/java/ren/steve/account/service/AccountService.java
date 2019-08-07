package ren.steve.account.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ren.steve.account.mapper.AccountMapper;
import ren.steve.account.pojo.Account;
import ren.steve.account.query.AccountQuery;
import ren.steve.common.vo.ResultVo;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 17:15
 * @Description :
 * @ModifiedBy :
 */
@Service
public class AccountService {

  @Autowired
  private AccountMapper accountMapper;

  public ResultVo queryAccountAll ( AccountQuery accountQuery ) {

    ResultVo resultVo = new ResultVo();

    if ( accountQuery.getPageNum() == null ) {
      accountQuery.setPageNum(1);
    }
    if ( accountQuery.getPageSize() == null ) {
      accountQuery.setPageSize(10);
    }

    PageHelper.startPage(accountQuery.getPageNum(), accountQuery.getPageSize());

    Example example = new Example(Account.class);

    if ( accountQuery.getFuzzySearch() != null ) {
      example.createCriteria().orLike("id", "%" + accountQuery.getFuzzySearch() + "%")
          .orLike("name", "%" + accountQuery.getFuzzySearch() + "%")
          .orLike("phone", "%" + accountQuery.getFuzzySearch() + "%");
    }

    if ( accountQuery.getUid() != null ) {
      example.createCriteria().orEqualTo("uid", accountQuery.getFuzzySearch());
    }

    if ( accountQuery.getStatus() != null ) {
      example.createCriteria().orEqualTo("status", accountQuery.getStatus());
    }

    if ( accountQuery.getAuthority() != null ) {
      example.createCriteria().orEqualTo("authority", accountQuery.getAuthority());
    }

    if ( accountQuery.getSort() == null ) {
      example.setOrderByClause("gmt_create DESC");
    } else {
      example.setOrderByClause(accountQuery.getSort());
    }

    List<Account> result = accountMapper.selectByExample(example);
    PageInfo<Account> page = new PageInfo<>(result);

    resultVo.setPageNum(page.getPageNum());
    resultVo.setPageSize(page.getPageSize());
    resultVo.setTotal(page.getTotal());
    resultVo.setTimestamp(System.currentTimeMillis());
    resultVo.setList(result);
    resultVo.setStatus(0);
    resultVo.setMessage("Query Accounts Success.");
    System.out.println("result : " + resultVo.toString());
    return resultVo;
  }

  public ResultVo queryAccountById ( Long id ) {
    ResultVo resultVo = new ResultVo();
    Account result = accountMapper.selectByPrimaryKey(id);
    resultVo.setTimestamp(System.currentTimeMillis());
    resultVo.setData(result);
    resultVo.setStatus(0);
    resultVo.setMessage("Query Account Success.");
    return resultVo;
  }
}
