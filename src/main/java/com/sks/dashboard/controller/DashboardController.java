package com.sks.dashboard.controller;

import com.sks.dashboard.service.DashBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class DashboardController {
    private final DashBoardService dashBoardService;

    @GetMapping("/myStocks")
    public List<String> myStocks(){
        return dashBoardService.getMyStocks();
    }

    @PostMapping("/myStockPrice")
    public Map<String, Float>  getMyStocksPrice(@RequestBody List<String> stocks){
        return dashBoardService.getMyStocksPrice(stocks);
    }

    @GetMapping("/myMarket")
    public Float myMarket(){
        return dashBoardService.getMarket();
    }
}
