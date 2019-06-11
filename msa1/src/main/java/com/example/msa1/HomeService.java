package com.example.msa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author InSeok <kr.chis@gmail.com>
 * Date : 2019-06-11
 * Time : 14:31
 * Remark :
 */
@Service
public class HomeService {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public String coffeeList(){
        return restTemplate.getForObject("http://localhost:8082/external/coffees",String.class);
    }

    public String about(){
        return restTemplate.getForObject("http://localhost:8083/internal/about",String.class);
    }
}
