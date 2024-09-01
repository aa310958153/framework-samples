package com.example.sampledubboconsumer.controller;

import com.example.sampleduuboprovidersdk.HelloWordTest;
import com.example.sampleduuboprovidersdk.StudentReqDTO;
import com.example.sampleduuboprovidersdk.StudentResDTO;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestTransactionController {

    /**
     * 使用服务提供者提供的服务，需要先从注册中心中获取服务
     */
    @DubboReference
    HelloWordTest helloWordTest;

    @RequestMapping("/test")
    @ResponseBody
    public List<StudentResDTO> test() {
        return helloWordTest.getUserInfo(new StudentReqDTO("2,", "22"));
    }

    @RequestMapping("/test2")
    @ResponseBody
    public List<StudentResDTO> test2() {
        return helloWordTest.getUserInfo2(Arrays.asList(new StudentReqDTO("2,", "22")));
    }


    @RequestMapping("/test3")
    @ResponseBody
    public List<StudentResDTO> test3() {
        return helloWordTest.getUserInfo3(2);
    }

    @RequestMapping("/test4")
    @ResponseBody
    public List<StudentResDTO> tes4() {
        return helloWordTest.getUserInfo4(new StudentReqDTO("2,", "22"), 1);
    }


    @RequestMapping("/test5")
    @ResponseBody
    public List<StudentResDTO> tes5() {
        return helloWordTest.getUserInfo5(Arrays.asList(new StudentReqDTO("2,", "22")), 1);
    }

}
