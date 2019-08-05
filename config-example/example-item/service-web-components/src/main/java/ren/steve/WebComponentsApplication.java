package ren.steve;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author : 刘国家
 * @Date : 2019-08-05 17:09
 * @Description :
 * @ModifiedBy :
 */

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("ren.steve.components.mapper")
public class WebComponentsApplication {
  public static void main ( String[] args ) {
    SpringApplication.run(WebComponentsApplication.class);
  }
}
