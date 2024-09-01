package com.example.sampleaop.aop;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理 ProcessStudent方法
 */
public class ProcessStudentHandle implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before method: " + method.getName());
        Object result = methodProxy.invokeSuper(o, args);
        System.out.println("After method: " + method.getName());
        return result;
    }
}
