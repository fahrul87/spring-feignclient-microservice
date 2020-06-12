package com.fahrul.eureka.client1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="eureka-client-2", url="http://localhost:8002/")
public interface MyFeignClient {
	
	@GetMapping
	String client2Response();

}
