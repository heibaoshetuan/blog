package xyz.yescn.blog.interceptor;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author issuser
 */
@Component
public class AuthorityInterceptor implements HandlerInterceptor {
    /**
     * 视图渲染之后的操作
     * @param request
     * @param response
     * @param obj
     * @param e
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e) {

    }

    /**
     * 处理请求完成后视图渲染之前的处理操作
     * @param request
     * @param response
     * @param obj
     * @param modelAndView
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView modelAndView) {

    }

    /**
     * 请求资源之前，进行权限验证
     * @param request
     * @param response
     * @param obj
     * @return
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) {
        System.out.println("getContextPath:" + request.getContextPath());
        System.out.println("getServletPath:" + request.getServletPath());
        System.out.println("getRequestURI:" + request.getRequestURI());
        System.out.println("getRequestURL:" + request.getRequestURL());
        System.out.println("getRealPath:" + request.getSession().getServletContext().getRealPath("image"));
        return true;
    }
}
