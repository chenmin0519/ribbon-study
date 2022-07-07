package cm.controller;

import cm.service.TestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestClientController {

    @Autowired
    TestController testController;

    @GetMapping("/getValue")
    public String test() throws InterruptedException {
        return testController.test();
    }

    @GetMapping("/getValue1")
    public String test111(){
        for(int i = 0 ; i < 10; i ++){
            new MyThread(testController,i).start();
        }
        return "success";
    }

    @GetMapping("/post")
    public String testpost(){
        for(int i = 0 ; i < 10; i ++){
            new MyThread(testController,i).start();
        }
        return "success";
    }
}
