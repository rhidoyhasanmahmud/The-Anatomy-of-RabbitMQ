# RabbitMQ Interview Questions & Answers & Coding Exercise

> Click :star:if you like the project. Pull Request are highly appreciated. Follow me [@HasanMahmud](https://www.linkedin.com/in/codemechanix/) for technical updates.

**Note:** This repository is specific to RabbitMQ.

### Table of Contents

| No. | Questions |
| --- | --------- |
|1  | [What is RabbitMQ?](#what-is-rabbitmq) |

## Core Message broker - RabbitMQ

1. ### What is RabbitMQ?

   RabbitMQ is a **message broker or queue manager** that implements the **AMQP protocol**. This means that he takes
   messages in a queue and sends them to consumers. A message can include any kind of information.

   ![rabbitmq-consume-produce-flow](images/RabbitMQ_Process.jpg)

    - **Producer**: publishes a message to an exchange.
    - **Message**: any kind of information or data.
    - **Queue**: hold many messages, queue (first in, first out).
    - **Broker**: in our case the RabbitMQ, a broker can have many queues.
    - **Consumer**: is the system that receives the message from the broker.

   With a message broker, we can decouple [separate] our application easily. This means we use a microservice
   architecture.
   ![rabbitmq-microservice](images/rabbitmq_microservice.jpg)

   And Let's imagine that the Email Service is unavailable.
   ![rabbitmq-microservice](images/rmq_3.png)
   
   That will not affect the other services, and the application still works.

   **[⬆ Back to Top](#table-of-contents)**

---

## Disclaimer

The questions provided in this repository are the summary of frequently asked questions across numerous companies. We
cannot guarantee that these questions will actually be asked during your interview process, nor should you focus on
memorizing all of them. The primary purpose is for you to get a sense of what some companies might ask — do not get
discouraged if you don't know the answer to all of them ⁠— that is ok!

Furthermore Collect Question and Answer from Different Blog.

Good luck with your interview 😊

---