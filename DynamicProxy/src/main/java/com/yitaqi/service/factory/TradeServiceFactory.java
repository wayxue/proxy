package com.yitaqi.service.factory;

import com.yitaqi.service.impl.CGLibProxy;
import com.yitaqi.service.impl.DynamicProxy;
import com.yitaqi.service.impl.ProxyTradeService;
import com.yitaqi.service.impl.TradeServiceImpl;
import com.yitaqi.service.interf.TradeService;

import java.lang.reflect.Proxy;

/**
 * 获取TradeService的实现类
 * @author xue
 */
public class TradeServiceFactory {

    /**
     * 无代理
     * @return
     */
    public static TradeService getNonProxyTradeService() {

        return new TradeServiceImpl();
    }

    /**
     * 静态代理
     * @return
     */
    public static TradeService getProxyTradeService() {

        return new ProxyTradeService(new TradeServiceImpl());
    }

    /**
     * JDK动态代理
     * @return
     */
    public static TradeService getDynamicTradeService() {

        Class<TradeService> targetClass = TradeService.class;
        return (TradeService) Proxy.newProxyInstance(targetClass.getClassLoader(),
                new Class[]{targetClass},
                new DynamicProxy(new TradeServiceImpl()));
    }

    /**
     * CGLib 动态代理
     * @return
     */
    public static TradeService getCGLibProxy() {

        return new CGLibProxy().getProxy(TradeServiceImpl.class);
    }

}
