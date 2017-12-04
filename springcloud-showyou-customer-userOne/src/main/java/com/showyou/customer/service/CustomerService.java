package com.showyou.customer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="service-zuul")
public interface CustomerService {
	
	@RequestMapping(value="/article/article/getAllArticle")
	public String getAllArticle();
}
