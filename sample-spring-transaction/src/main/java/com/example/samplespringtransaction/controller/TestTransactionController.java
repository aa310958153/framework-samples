package com.example.samplespringtransaction.controller;

import com.example.samplespringtransaction.dao.TestTransactionDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestTransactionController {
    @Resource
    private TestTransactionDao testTransactionDao;

    @RequestMapping("/test")
    public void test() {
        testTransactionDao.processStudent();
    }
}
