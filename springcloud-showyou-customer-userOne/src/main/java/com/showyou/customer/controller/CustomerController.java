package com.showyou.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.showyou.customer.service.CustomerService;

/**
 * Customer HelloWorld 案例
 * <p>
 * Created by bysocket on 06/22/17.
 */

@RestController
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private RestTemplate restTemplate; // HTTP 访问操作类
    
    @Autowired
    private CustomerService customerService;
    

    @RequestMapping("/customer")
    public String customer() {
    	System.out.println("123-------------------------------");
        String providerMsg = restTemplate.getForEntity("http://article/article/getAllArticle",
                String.class).getBody();

        return "Hello,Customer! msg from provider : <br/><br/> " + providerMsg;
    }
    
    
    @RequestMapping("/feignCustomer")
    public String feignCustomer(){
    	System.out.println("123-------------------------------");

        return "Hello,Customer! msg from provider ++++ customerService : <br/><br/> " + customerService.getAllArticle();
    }
}