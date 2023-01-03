package com.example.springbootrabbitmq.service;

import com.example.springbootrabbitmq.dto.request.OrderRequest;
import com.example.springbootrabbitmq.entity.Order;
import com.example.springbootrabbitmq.rabbitMqConfig.RabbitConfig;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final AmqpTemplate rabbitTemplate;
    private final ModelMapper modelMapper;
    Logger logger= LoggerFactory.getLogger(OrderService.class);

    public void publishMessage(OrderRequest orderRequest){
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_NAME,RabbitConfig.BINDING_KEY,orderRequest);
    }
    @RabbitListener(queues = RabbitConfig.QUEUE_NAME)
    public void consumeMessage(OrderRequest orderRequest){
       logger.info("Message consumed " +orderRequest);
    }


}
