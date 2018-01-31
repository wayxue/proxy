package com.yitaqi.factory;

import com.yitaqi.impl.ProxyTradeServiceImpl;
import com.yitaqi.impl.StaticProxyTradeServiceImpl;
import com.yitaqi.impl.TradeServiceImpl;
import com.yitaqi.interf.TradeService;

import java.lang.reflect.Proxy;

public class TradeServiceFactory {

    /**
     * 静态代理
     * @return
     */
    public static TradeService getStaticProxyTradeService() {
        return new StaticProxyTradeServiceImpl(new TradeServiceImpl());
    }

    public static TradeService getProxyTradeService() {
        Class<TradeService> targetClass = TradeService.class;
        return (TradeService) Proxy.newProxyInstance(targetClass.getClassLoader(),
                new Class[] {targetClass},
                new ProxyTradeServiceImpl(new TradeServiceImpl()));
    }
}
