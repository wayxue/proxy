package com.yitaqi.impl;

import com.yitaqi.interf.TradeService;

public class StaticProxyTradeServiceImpl implements TradeService {

    private TradeServiceImpl tradeService;

    public StaticProxyTradeServiceImpl(TradeServiceImpl tradeService) {
        this.tradeService = tradeService;
    }

    @Override
    public void trade() {

        System.out.println("静态代理");
        tradeService.trade();
    }
}
