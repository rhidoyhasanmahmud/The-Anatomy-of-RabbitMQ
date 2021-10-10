package com.codemechanix.rabbitmqservice.service;

import com.codemechanix.rabbitmqservice.model.Payload;

public interface ProducerService {
    void sendToDirectExchange(Payload payload, String routingKey);

    void sendToTopicExchange(Payload payload, String topic);

    void sendToFanoutExchange(Payload payload);
}