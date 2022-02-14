package com.hdd.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "payment-service",fallback = PaymentFallbackService.class)
public interface PaymentClient {
    @GetMapping("/payment/{id}")
    public ResponseEntity<String> payment(@PathVariable("id") int id);
}
