package com.ubungit.demo.Controller;

import com.ubungit.demo.ApiResult;
import com.ubungit.demo.aop.NoRepeatSubmit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController{

    @RequestMapping("/test")
    @NoRepeatSubmit(lockTime = 30)
    public ApiResult Index() {
        try {
            // 模拟业务场景
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ApiResult(200, "chenggong", null);
    }
}