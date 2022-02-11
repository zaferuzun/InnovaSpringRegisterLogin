package com.innova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@EnableScheduling
public class InnovaSpringRegisterLoginApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(InnovaSpringRegisterLoginApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(InnovaSpringRegisterLoginApplication.class);
        Environment env = app.run(args).getEnvironment();

        //SpringApplication.run(InnovaSpringRegisterLoginApplication.class, args);
    }

}
