package com.example.springbootrabbitmq.controller;

import com.example.springbootrabbitmq.dto.request.OrderRequest;
import com.example.springbootrabbitmq.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/produce")
    public String sendToQueue(@RequestBody OrderRequest orderRequest){
       orderService.publishMessage(orderRequest);
       return "Object sent to queue";
    }
}
