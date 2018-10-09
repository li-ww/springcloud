package fun.lww.eurekaconsumerribbonhystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * 使用此注解来实现 Hystrix服务降级 依赖隔离
     * @return
     */
    //@HystrixCommand()
    @HystrixCommand(fallbackMethod = "fallbackMeth")
    public String consumer() {
        return restTemplate.getForObject("http://eurekaclient/dc", String.class);
    }

    public String fallbackMeth() {
        return "fallback";
    }
}
