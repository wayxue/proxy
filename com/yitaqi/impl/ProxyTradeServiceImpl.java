package com.yitaqi.impl;

import com.yitaqi.interf.TradeService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyTradeServiceImpl implements InvocationHandler {
    private Object object;

    public ProxyTradeServiceImpl(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("动态代理");
        return method.invoke(object, args);
    }
}
