package com.example.springbootrabbitmq.rabbitMqConfig;

import org.modelmapper.ModelMapper;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String QUEUE_NAME="order_queue";
    public static final String EXCHANGE_NAME="order_exchange";
    public static final String BINDING_KEY="order_binding_key";

    @Bean
    public Queue queue(){
        return new Queue(QUEUE_NAME,false);
    }
    @Bean
    public TopicExchange exchange(){
        return new TopicExchange(EXCHANGE_NAME);
    }
    @Bean
    public Binding binding(Queue queue,TopicExchange exchange){
        return BindingBuilder
                .bind(queue)
                .to(exchange)
                .with(BINDING_KEY);
    }
    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }

//    @Bean
//    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory){
//        RabbitTemplate rabbitTemplate=new RabbitTemplate(connectionFactory);
//        rabbitTemplate.setMessageConverter(messageConverter());
//        return rabbitTemplate;
//    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
