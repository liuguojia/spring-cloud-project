package ren.steve;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 14:33
 * @Description :
 * @ModifiedBy :
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("ren.steve.account.mapper")
public class AccountApplication {
  public static void main ( String[] args ) {
    SpringApplication.run(AccountApplication.class);
  }
}
