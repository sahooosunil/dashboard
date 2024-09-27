package com.sks.dashboard.service;

import com.sks.dashboard.client.MarketClient;
import com.sks.dashboard.client.NiftyClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DashBoardService {
    private final MarketClient marketClient;
    private final NiftyClient niftyClient;

    public List<String> getMyStocks() {
        return marketClient.getStockList();
    }

    public Map<String, Float> getMyStocksPrice(List<String> myStocks) {
        return marketClient.getStockPrice(myStocks);
    }

    public Float getMarket(){
        Float sensex = niftyClient.getSenSexPrice();
        Float bank = niftyClient.getBankNifty();
        Float nifty = niftyClient.getNiftyPrice();
        return (sensex+bank+nifty)/3;
    }
}
