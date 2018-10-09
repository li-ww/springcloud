package fun.lww.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @declaration 服务监控
 * 对于需要监控的服务需添加hystrix依赖
 * 访问http://localhost:2201/strix查看
 * @author liweiwei
 * @date 2018/7/7 11:18
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixdashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixdashboardApplication.class, args);
    }
}
