package cm.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "ribbon-study")
public interface TestController {

    @GetMapping("/test")
    String test() throws InterruptedException;
    @GetMapping("/post")
    public String post() throws InterruptedException;
}