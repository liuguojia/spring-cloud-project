package ren.steve;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author : 刘国家
 * @Date : 2019-08-05 18:36
 * @Description :
 * @ModifiedBy :
 */

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("ren.steve.authority.mapper")
public class AuthorityApplication {
  public static void main ( String[] args ) {
    SpringApplication.run(AuthorityApplication.class);
  }
}
