package ren.steve.account.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ren.steve.account.query.AccountQuery;
import ren.steve.account.service.AccountService;
import ren.steve.common.enums.AccountExceptionEnum;
import ren.steve.common.enums.CommonExceptionEnum;
import ren.steve.common.exception.ExampleException;
import ren.steve.common.vo.ResultVo;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 17:20
 * @Description :
 * @ModifiedBy :
 */
@RestController
@RequestMapping("account")
public class AccountController {

  @Autowired
  private AccountService accountService;

  @PostMapping("list")
  public ResponseEntity<ResultVo> queryAccountAll ( @ModelAttribute AccountQuery accountQuery ) {
    System.out.println("accountQuery : " + accountQuery);
    return ResponseEntity.ok(accountService.queryAccountAll(accountQuery));
  }

  @PostMapping("current")
  public ResponseEntity<ResultVo> queryAccountById ( @ModelAttribute AccountQuery accountQuery ) {
    System.out.println("account : " + accountQuery);
    if ( accountQuery.getId() == null ) {
      ExampleException exampleException = new ExampleException(AccountExceptionEnum.ACCOUNT_NOT_FOUND);
      throw exampleException;
    }
    return ResponseEntity.ok(accountService.queryAccountById(accountQuery.getId()));
  }

}
