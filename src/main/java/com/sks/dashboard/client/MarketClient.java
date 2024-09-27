package com.sks.dashboard.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@FeignClient(name = "market", url = "http://localhost:8881/")
public interface MarketClient {
    @GetMapping("/isMarketUp")
    public String isMarketUp();

    @PostMapping("/stocksPrice")
    public Map<String,Float> getStockPrice(@RequestBody List<String> stocks);

    @GetMapping("/stockList")
    public List<String> getStockList();
}
