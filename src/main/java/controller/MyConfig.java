package controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring/spring-web.xml")
public class MyConfig {

//    @Bean
//    ContentNegotiatingViewResolver xmlView() {
//        ContentNegotiatingViewResolver cnvr =new ContentNegotiatingViewResolver();
//        cnvr.setContentNegotiationManager();
//        return cnvr;
//    }


}
