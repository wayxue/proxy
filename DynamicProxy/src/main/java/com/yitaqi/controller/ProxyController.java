package com.yitaqi.controller;

import com.yitaqi.service.factory.TradeServiceFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller 层
 * @author xue
 */
@RestController
public class ProxyController {

    @RequestMapping(method = RequestMethod.GET, path = "/nonProxy")
    public String nonProxy() {

        return TradeServiceFactory.getNonProxyTradeService().trade();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proxy")
    public String proxy() {

        return TradeServiceFactory.getProxyTradeService().trade();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/dynamicProxy")
    public String dynamicProxy() {

        return TradeServiceFactory.getDynamicTradeService().trade();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cglibProxy")
    public String cglibProxy() {

        return TradeServiceFactory.getCGLibProxy().trade();
    }
}
