package com.hdd.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentClient{

    @Override
    public ResponseEntity<String> payment(int id) {
        return new ResponseEntity<String>("feign调用，异常降级方法", HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }
}
