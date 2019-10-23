package com.xiongxin.sample.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiongxin.sample.util.DTOModelMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    private final ApplicationContext applicationContext;
    private final SqlSessionFactory sqlSessionFactory;

    public WebMvcConfig(ApplicationContext applicationContext, SqlSessionFactory sqlSessionFactory) {
        this.applicationContext = applicationContext;
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);

        ObjectMapper objectMapper = Jackson2ObjectMapperBuilder.json()
                .applicationContext(this.applicationContext).build();

        argumentResolvers.add(new DTOModelMapper(objectMapper, sqlSessionFactory));
    }
}
