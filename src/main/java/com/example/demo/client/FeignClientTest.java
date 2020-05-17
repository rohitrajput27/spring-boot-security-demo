package com.example.demo.client;

import com.example.demo.client.model.SPMResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@FeignClient(path = "/spm-services",value = "SPMID",url ="http://localhost:9028")
public interface FeignClientTest {

    @RequestMapping(method = RequestMethod.GET, value = "/storedpaymentmethod/{spmID}", consumes = "application/json;charset=UTF-8",produces = "application/json;charset=UTF-8")
    SPMResponse getSPMResponse(@PathVariable("spmID") String spmID, @RequestHeader("client-id") String clientId, @RequestHeader("userID") String userId,
                                      @RequestHeader("transaction-id") String transactionId
                                            );


}
