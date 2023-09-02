package com.cxz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GlobalCorsConfig implements WebMvcConfigurer {
    static final String[] ORIGINS = new String[]{"GET", "POST", "PUT", "DELETE", "OPTIONS"};

    //    @Bean
//    public CorsWebFilter corsFilter() {
//        //1.添加CORS配置信息
//        CorsConfiguration config = new CorsConfiguration();
//        config.addAllowedOrigin("*");
//        config.addAllowedMethod("*");
//        config.addAllowedHeader("*");
//        //2.是否发送Cookie信息
//        config.setAllowCredentials(true);
//        //3.有效时间
//        config.setMaxAge(3600L);
//        //2.添加映射路径，我们拦截一切请求
//        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
//        configSource.registerCorsConfiguration("/**", config);
//        //4.返回新的CorsFilter.
//        return new CorsWebFilter(configSource);
//    }
@Override
public void addCorsMappings(CorsRegistry registry) {
    // 所有的当前站点的请求地址，都支持跨域访问。
    registry.addMapping("/**")
            //是否发送Cookie
            .allowCredentials(true)
            //放行哪些原始域
            .allowedOrigins("*")
            //当前站点支持的跨域请求类型是什么
            .allowedMethods(ORIGINS)
            //	允许请求头中的header，默认都支持
//            .allowedHeaders("*")
            //响应头中允许访问的header，默认为空
//            .exposedHeaders("*")
            //预请求的结果的有效期，默认30分钟,这里为一天
            .maxAge(24 * 60 * 60);
}
}
