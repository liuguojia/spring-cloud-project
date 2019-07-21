package ren.steve.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author : 刘国家
 * @Date : 2019-07-21 15:21
 * @Description : 全局拦截器
 * @ModifiedBy :
 */

public class GlobalInterceptor implements HandlerInterceptor {

  // 日志记录
  private static final Logger log = LoggerFactory.getLogger(GlobalInterceptor.class);

  @Override
  public boolean preHandle ( HttpServletRequest request, HttpServletResponse response, Object handler ) throws Exception {
    return true;
  }

  @Override
  public void postHandle ( HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView ) throws Exception {

  }

  @Override
  public void afterCompletion ( HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex ) throws Exception {

  }
}
