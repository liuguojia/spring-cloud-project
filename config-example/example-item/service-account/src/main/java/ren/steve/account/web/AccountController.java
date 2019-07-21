package ren.steve.account.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ren.steve.account.pojo.Account;
import ren.steve.account.pojo.AccountQuery;
import ren.steve.account.service.AccountService;
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
  public ResponseEntity<ResultVo> queryAccountById ( @ModelAttribute Account account ) {
    System.out.println("account : " + account);
    if ( account.getId() == null ) {
      throw new ExampleException(CommonExceptionEnum.ACCOUNT_ID_NOT_FOUND);
    }
    return ResponseEntity.ok(accountService.queryAccountById(account.getId()));
  }

}
