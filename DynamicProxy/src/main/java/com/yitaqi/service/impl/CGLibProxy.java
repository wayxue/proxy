package com.yitaqi.service.impl;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib动态代理
 * @author xue
 */
public class CGLibProxy implements MethodInterceptor {

    public <T> T getProxy(Class<T> cla) {
        return (T) Enhancer.create(cla, this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        return "CGLib 动态代理" + methodProxy.invokeSuper(o, objects);
    }
}
