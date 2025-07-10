package cn.sdu.fd.Config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 声明这是一个配置类
public class RabbitMQConfig {
    public static final String EXCHANGE_NAME = "myExchange"; // 定义交换机
    public static final String QUEUE_NAME = "myQueue"; // 定义队列
    public static final String ROUTING_KEY = "myRoutingKey"; // 定义路由键

    // 创建队列
    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME);
    }
    // 创建交换机
    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }
    // 绑定队列和交换机，并指定路由键
    @Bean
    public Binding binding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }
}
