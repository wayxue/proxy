package com.yitaqi.service.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 动态代理
 * @author xue
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public DynamicProxy(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return "JDK动态代理" + method.invoke(target, args);
    }

}
