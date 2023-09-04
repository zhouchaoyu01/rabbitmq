package com.cz.delayqueue.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description <延迟队列消费者>
 * @author: zhouchaoyu
 * @Date: 2023-09-04
 */
@Slf4j
@Component
public class DelayedQueueConsumer {
    public static final String DELAYED_QUEUE_NAME = "delayed.queue";
    @RabbitListener(queues = DELAYED_QUEUE_NAME)
    public void receiveDelayedQueue(Message message){
        String msg = new String(message.getBody());
        log.info("当前时间：{},收到延时队列的消息：{}", new Date().toString(), msg);
    }
}
