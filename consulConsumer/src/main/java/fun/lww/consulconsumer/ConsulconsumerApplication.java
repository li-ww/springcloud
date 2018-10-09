package fun.lww.consulconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @declaration consul 服务调用者
 * @author liweiwei
 * @date 2018/7/6 12:04
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulconsumerApplication {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsulconsumerApplication.class, args);
    }
}
