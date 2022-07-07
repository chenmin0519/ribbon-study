package cm.service.impl;

import cm.service.TestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestServerImpl implements TestController {

    @Value("${server.port}")
    private String prot;

    @Override
    @GetMapping("/test")
    public String test() throws InterruptedException {
        Thread.sleep(100);
        return "hello:"+prot;
    }

    @Override
    @PostMapping("/post")
    public String post() throws InterruptedException {
        Thread.sleep(100);
        return "hello:"+prot;
    }
}
