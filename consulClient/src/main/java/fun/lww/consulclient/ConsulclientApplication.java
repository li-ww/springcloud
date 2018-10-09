package fun.lww.consulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @declaration 使用consul服务中心 这里是客户端-服务提供者
 * @author liweiwei
 * @date 2018/7/6 11:27
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulclientApplication.class, args);
    }
}
