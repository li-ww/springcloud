package fun.lww.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Value("${server.port}")
    String port;

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/dc")
    public String dc() {
        /*try {
            //测试断路器
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services + " - port:" + port);
        return services + " - port:" + port;
    }
}
