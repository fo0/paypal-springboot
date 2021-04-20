package com.masasdani.paypal;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Application {

	public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
            // disable default petstore
            .properties("springdoc.swagger-ui.disable-swagger-default-url=true") 
            .properties("springdoc.api-docs.enabled=false")
            .properties("server.forward-headers-strategy=framework")
            .run(args);
	}
}