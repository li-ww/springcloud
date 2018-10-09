package fun.lww.streamrabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @declaration 测试未成功 未成功获取到消息
 * @author liweiwei
 * @date 2018/7/7 20:31
 */
@RunWith(SpringRunner.class)
@EnableBinding(value = {StreamrabbitmqApplicationTests.SinkSender.class})
public class StreamrabbitmqApplicationTests {

    @Autowired
    SinkSender sinkSender;

    @Test
    public void senkSenderTester() {
        sinkSender.output().send(MessageBuilder.withPayload("----------------------- produce a message ：").build());

    }

    interface SinkSender {
        String OUTPUT = "input";

        @Output(SinkSender.OUTPUT)
        MessageChannel output();
    }
}
