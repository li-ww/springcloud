package fun.lww.streamrabbitmq;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @declaration 接受RabbitMQ消息 消费者
 * @author liweiwei
 * @date 2018/7/7 19:54
 */
@EnableBinding(Sink.class)
public class SinkReceiver {

    @StreamListener(Sink.INPUT)
    public void receiver(Object payload) {
        System.out.println("----------------------");
        System.out.println("Received：" + payload);
        System.out.println("----------------------");
    }
}
