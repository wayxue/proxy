package com.yitaqi.print;

import com.yitaqi.factory.TradeServiceFactory;

public class TradePrint {

    public static void main(String[] args) {

        TradeServiceFactory.getStaticProxyTradeService().trade();
        System.out.println("++++++++++++++");
        TradeServiceFactory.getProxyTradeService().trade();
    }
}
