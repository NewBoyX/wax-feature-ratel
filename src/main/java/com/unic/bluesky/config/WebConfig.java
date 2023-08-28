package com.unic.bluesky.config;

import com.unic.bluesky.filter.TraceIdInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class WebConfig {
    @Bean
    public FilterRegistrationBean traceFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new TraceIdInterceptor());
        registrationBean.setUrlPatterns(Collections.singletonList("/*"));
        registrationBean.setOrder(1);
        return registrationBean;
    }

}
