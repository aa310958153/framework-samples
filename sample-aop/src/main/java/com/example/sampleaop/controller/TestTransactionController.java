package com.example.sampleaop.controller;

import com.example.sampleaop.aop.ProcessStudentHandle;
import com.example.sampleaop.dao.TestTransactionDao;
import com.example.sampleaop.dao.TestTransactionDaoImpl;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestTransactionController {
    @Resource
    private TestTransactionDao testTransactionDao;

    @RequestMapping("/test")
    public void test() {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, " /Users/liqiang/Desktop/go/grpc");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TestTransactionDaoImpl.class);
        enhancer.setCallback(new ProcessStudentHandle());
        TestTransactionDao dao = (TestTransactionDao) enhancer.create();
        dao.processStudent();
    }

    public static void main(String[] args) {
        //将cglib动态生成的class输出到项目根目录
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "./cglib");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TestTransactionDaoImpl.class);
        enhancer.setCallback(new ProcessStudentHandle());
        TestTransactionDao dao = (TestTransactionDao) enhancer.create();
        dao.processStudent();
    }
}
