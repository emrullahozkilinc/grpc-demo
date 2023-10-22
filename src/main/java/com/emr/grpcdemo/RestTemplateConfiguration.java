package com.emr.grpcdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    RestTemplate restTemplate(ProtobufHttpMessageConverter protobufConverter) {
        return new RestTemplate(Collections.singletonList(protobufConverter));
    }
}
