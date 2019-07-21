package ren.steve.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 17:52
 * @Description :
 * @ModifiedBy :
 */
@Configuration
public class GlobalCORSConfig {

  @Bean
  public CorsFilter corsFilter () {
    // 1. 添加CORS配置信息
    CorsConfiguration config = new CorsConfiguration();
    // 1.1. 允许的域，不要写*，否则Cookie就无发使用
    config.addAllowedOrigin("http://127.0.0.1:5555");
    // config.addAllowedOrigin("*");
    // 1.2. 是否发送Cookie信息
    config.setAllowCredentials(true);
    // 1.3. 允许的请求方式
    config.addAllowedMethod("OPTIONS");
    config.addAllowedMethod("HEAD");
    config.addAllowedMethod("GET");
    config.addAllowedMethod("POST");
    config.addAllowedMethod("PUT");
    config.addAllowedMethod("DELETE");
    config.addAllowedMethod("PATCH");
    // 1.4. 允许的头信息
    config.addAllowedHeader("*");
    // 1.5 有效时长
    config.setMaxAge(43200L);

    // 2. 添加映射路径，这里拦截所有请求
    UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
    configSource.registerCorsConfiguration("/**", config);

    // 3. 返回新的CorsFilter
    return new org.springframework.web.filter.CorsFilter(configSource);
  }
}
