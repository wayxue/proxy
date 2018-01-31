package com.yitaqi.service.impl;

import com.yitaqi.service.interf.TradeService;

/**
 * 静态代理
 * @author xue
 */
public class ProxyTradeService implements TradeService {

    private TradeService tradeService;

    public ProxyTradeService(TradeService tradeService) {
        this.tradeService = tradeService;
    }

    @Override
    public String trade() {

        return "静态代理：" + tradeService.trade();
    }
}
