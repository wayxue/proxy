package com.yitaqi.service.impl;

import com.yitaqi.service.interf.TradeService;

/**
 * 无代理
 * @author xue
 */
public class TradeServiceImpl implements TradeService {

    @Override
    public String trade() {
        return "buy something to eat";
    }
}
