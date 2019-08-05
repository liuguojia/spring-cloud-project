package ren.steve.authority.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ren.steve.authority.AuthorityParams;
import ren.steve.authority.pojo.Authority;
import ren.steve.authority.query.AuthorityQuery;
import ren.steve.authority.service.AuthorityService;
import ren.steve.common.enums.CommonExceptionEnum;
import ren.steve.common.exception.ExampleException;
import ren.steve.common.vo.ResultVo;

/**
 * @Author : 刘国家
 * @Date : 2019-08-05 18:42
 * @Description :
 * @ModifiedBy :
 */

@RestController
@RequestMapping("authority")
public class AuthorityController {

  @Autowired
  private AuthorityService authorityService;

  @PostMapping("current")
  public ResponseEntity<ResultVo> queryAuthority ( @ModelAttribute AuthorityQuery authorityQuery ) {
    if ( authorityQuery.getId() == null ) {
      throw new ExampleException(CommonExceptionEnum.AUTHORITY_ID_NOT_FOUND);
    }
    return ResponseEntity.ok(authorityService.queryAuthority(authorityQuery));
  }

  @PostMapping("insert")
  public ResponseEntity<ResultVo> insertAuthority( @ModelAttribute AuthorityParams authorityParams ) {

    return ResponseEntity.ok(authorityService.insertAuthority(authorityParams));

  }



}
