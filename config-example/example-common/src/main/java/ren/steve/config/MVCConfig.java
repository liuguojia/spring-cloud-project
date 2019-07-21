package ren.steve.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ren.steve.common.interceptor.GlobalInterceptor;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 15:03
 * @Description : 拦截器注入配置
 * @ModifiedBy :
 */

@Configuration
public class MVCConfig implements WebMvcConfigurer {

  @Override
  public void addInterceptors ( InterceptorRegistry registry ) {
    registry.addInterceptor(new GlobalInterceptor()).addPathPatterns("/**");
  }
}
