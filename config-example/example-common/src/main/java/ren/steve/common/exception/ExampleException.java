package ren.steve.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ren.steve.common.enums.AccountEnum;
import ren.steve.common.enums.CommonExceptionEnum;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 15:16
 * @Description :
 * @ModifiedBy :
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExampleException extends RuntimeException{

  private CommonExceptionEnum commonExceptionEnum;

}
