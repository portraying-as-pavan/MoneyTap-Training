package com.example.api_demo;
import com.example.entity.Quote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//import java.util.logging.Logger;


@SpringBootApplication
public class ApiDemoApplication {

    //private final static Logger log= LoggerFactory.getLogger(ApiDemoApplication.class);
    private static final Logger log = LoggerFactory.getLogger(ApiDemoApplication.class);
    public static void main(String[] args) {

        SpringApplication.run(ApiDemoApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
        return args -> {
            Quote quote=restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random",Quote.class);
            log.info(quote.toString());
        };
    }

}
