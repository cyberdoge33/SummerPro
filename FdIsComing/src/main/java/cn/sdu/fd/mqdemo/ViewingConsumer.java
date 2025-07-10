package cn.sdu.fd.mqdemo;

import cn.sdu.fd.Config.RabbitMQConfig;
import cn.sdu.fd.mapper.YuyuekanfangMapper;
import cn.sdu.fd.pojo.Yuyuekanfang;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.messaging.handler.annotation.Header;

@Component
public class ViewingConsumer {

    // 最简单的消息监听器
    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void processViewing(Yuyuekanfang yuyuekanfang) {
        // 空实现 - 仅接收消息不做任何处理
    }
}