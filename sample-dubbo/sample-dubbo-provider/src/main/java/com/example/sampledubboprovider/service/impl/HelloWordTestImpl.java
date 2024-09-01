package com.example.sampledubboprovider.service.impl;

import com.alibaba.fastjson2.JSON;
import com.example.sampleduuboprovidersdk.HelloWordTest;
import com.example.sampleduuboprovidersdk.StudentReqDTO;
import com.example.sampleduuboprovidersdk.StudentResDTO;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@DubboService
@Service
public class HelloWordTestImpl implements HelloWordTest {

    @Override
    public List<StudentResDTO> getUserInfo(StudentReqDTO studentReqDTO) {
        System.out.println(JSON.toJSON(studentReqDTO));
        return Arrays.asList(new StudentResDTO("小明", "22"));
    }

    @Override
    public List<StudentResDTO> getUserInfo2(List<StudentReqDTO> studentReqDTO) {
        System.out.println(JSON.toJSON(studentReqDTO));
        return Arrays.asList(new StudentResDTO("小明", "2"));
    }

    @Override
    public List<StudentResDTO> getUserInfo3(Integer id) {

        return Arrays.asList(new StudentResDTO("小明", id.toString()));
    }

    @Override
    public List<StudentResDTO> getUserInfo4(StudentReqDTO studentReqDTO, Integer id) {
        return Arrays.asList(new StudentResDTO("小明4", id.toString()));
    }

    @Override
    public List<StudentResDTO> getUserInfo5(List<StudentReqDTO> studentReqDTO, Integer id) {
        return Arrays.asList(new StudentResDTO("小明4", id.toString()));
    }
}
