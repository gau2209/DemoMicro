package com.example.orderservice.Controller;

import com.example.orderservice.Request.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    @PostMapping
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        return null;
    }
}
