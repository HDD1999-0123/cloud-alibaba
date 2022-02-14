package com.hdd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymenController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/{id}")
    public ResponseEntity<String> payment(@PathVariable("id") int id){
        return ResponseEntity.ok("订单号 = " + id + "，支付成功，server.port" + serverPort);
    }

}
