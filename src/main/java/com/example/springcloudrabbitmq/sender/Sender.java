package com.example.springcloudrabbitmq.sender;

import com.example.springcloudrabbitmq.config.RabbitmqConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        System.out.println("刘亮 发送消息...");
        //发送消息的时候，传递routing_key + message ,
        //routing_key的作用是，给转发器exchange后，exchange会按照特定的路由算法，将消息给指定的queue
        rabbitTemplate.convertAndSend(RabbitmqConfig.QUEUE_NAME, "你好， 刘亮!");
    }
}
