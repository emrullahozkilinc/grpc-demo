package com.emr.grpcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.emr.grpcdemo.TrainingPOJO.*;

@SpringBootApplication
public class GrpcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcDemoApplication.class, args);
    }


}
