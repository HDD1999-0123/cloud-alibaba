package com.hdd.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Nacos底层使用Spring Cloud Common中的Spring Cloud LoadBalancer组件实现负载均衡，注入RestTemplate，
 * 使用注解@LoadBalanced开启负载均衡功能
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
