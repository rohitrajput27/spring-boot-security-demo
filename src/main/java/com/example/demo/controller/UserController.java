package com.example.demo.controller;

import com.example.demo.client.FeignClientTest;
import com.example.demo.client.model.SPMResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private FeignClientTest feignClient;

    @GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.ALL_VALUE)
    public ResponseEntity<SPMResponse> getAccount() {

        return ResponseEntity.ok(feignClient.getSPMResponse("211","test","test","test"));
    }

    @GetMapping(path = "/get2", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.ALL_VALUE)
    public ResponseEntity<SPMResponse> getAccount2() {

        return ResponseEntity.ok(feignClient.getSPMResponse("211","test","test","test"));
    }
}
