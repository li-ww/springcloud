package fun.lww.eurekaconsumerribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @declaration 实现负载均衡 服务调用者
 * @author liweiwei
 * @date 2018/7/6 13:04
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaconsumerribbonApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaconsumerribbonApplication.class, args);
    }
}
