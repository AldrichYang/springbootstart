package controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("controller")
@ImportResource("classpath:spring/spring-web.xml")
@EnableAutoConfiguration
public class MyConfig {

//    @Bean
//    ContentNegotiatingViewResolver xmlView() {
//        ContentNegotiatingViewResolver cnvr =new ContentNegotiatingViewResolver();
//        cnvr.setContentNegotiationManager();
//        return cnvr;
//    }


}
