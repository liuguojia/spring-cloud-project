package ren.steve.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 13:51
 * @Description : 主网关Main方法
 * @ModifiedBy :
 */

@EnableZuulProxy
@SpringCloudApplication
public class Gateway {
  public static void main ( String[] args ) {
    SpringApplication.run(Gateway.class);
  }
}
