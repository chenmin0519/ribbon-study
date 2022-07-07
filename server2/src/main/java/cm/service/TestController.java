package cm.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "ribbon-study")
public interface TestController {

    @GetMapping("/test")
    String test();

    @PostMapping("/post")
    public String post();
}
