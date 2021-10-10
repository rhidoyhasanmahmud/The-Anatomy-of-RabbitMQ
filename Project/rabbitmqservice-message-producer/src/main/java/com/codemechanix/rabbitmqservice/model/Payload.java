package com.codemechanix.rabbitmqservice.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payload {
    private String message;
}
