package ren.steve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 14:02
 * @Description :
 * @ModifiedBy :
 */
@EnableEurekaServer
@SpringBootApplication
public class Registry {
  public static void main ( String[] args ) {
    SpringApplication.run(Registry.class);
  }
}
