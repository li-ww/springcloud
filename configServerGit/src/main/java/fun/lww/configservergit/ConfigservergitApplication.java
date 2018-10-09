package fun.lww.configservergit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @declaration 配置文件中心 server端
 * @author liweiwei
 * @date 2018/7/6 17:27
 */
@EnableConfigServer
@SpringBootApplication
@RestController
public class ConfigservergitApplication {

    @Value("${name}")
    String name = "";

    @RequestMapping("/getName")
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigservergitApplication.class, args);
    }
}
