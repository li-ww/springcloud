package fun.lww.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @declaration 服务消费者
 * @author liweiwei
 * @date 2018/7/6 11:47
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaconsumerApplication {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaconsumerApplication.class, args);
    }
}
