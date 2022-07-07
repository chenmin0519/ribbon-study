package cm.controller;

import cm.service.TestController;

public class MyThread extends Thread{

    TestController testController;
    Integer index;

    MyThread(TestController testController,Integer index){
        this.testController = testController;
        this.index=index;
    }
    @Override
    public void run() {
        for(int i = 0 ; i < 100; i ++){
            try {
                System.out.println(testController.post() + "，thread" + index + "，次数：" + i);
            }catch (Exception e){
                System.out.println("失败："+"，thread" + index + "，次数：" + i);
            }
        }
    }
}
