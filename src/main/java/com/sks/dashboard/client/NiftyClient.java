package com.sks.dashboard.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "nifty", url = "http://localhost:8080/")
public interface NiftyClient {

    @GetMapping("/niftyPrice")
    public Float getNiftyPrice();

    @GetMapping("/senSexPrice")
    public Float getSenSexPrice();

    @GetMapping("/bankPrice")
    public Float getBankNifty();

}
