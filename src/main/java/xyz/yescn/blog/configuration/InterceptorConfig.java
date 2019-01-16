package xyz.yescn.blog.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xyz.yescn.blog.interceptor.AuthorityInterceptor;

/**
 * @author issuser
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    private final AuthorityInterceptor authorityInterceptor;

    @Autowired
    public InterceptorConfig(AuthorityInterceptor authorityInterceptor) {
        this.authorityInterceptor = authorityInterceptor;
    }

    /**
     * 自定义拦截器，添加拦截路径和排除拦截路径
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 自定义拦截器，添加拦截路径和排除拦截路径
        registry.addInterceptor(authorityInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/images/**", "/css/**", "/js/**", "/assets/**",
                        "/dist/**", "/index.html", "/index", "/login",
                        "/login.html", "/daily/list", "/daily/manager", "/picture/list", "/daily/view/*", "/view.html",
                        "/technology/list", "/user", "/ueditor/**", "/registry", "registry.html");
    }


}
