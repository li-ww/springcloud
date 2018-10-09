package fun.lww.eurekaconsumerfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @declaration 使用feign调用服务
 * @author liweiwei
 * @date 2018/7/6 14:09
 */
@FeignClient("eurekaclient")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
