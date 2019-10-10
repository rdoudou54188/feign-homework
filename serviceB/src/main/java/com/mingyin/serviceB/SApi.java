package com.mingyin.serviceB;

import myfirst.Api;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("ServiceA")
public interface SApi extends Api {
}
