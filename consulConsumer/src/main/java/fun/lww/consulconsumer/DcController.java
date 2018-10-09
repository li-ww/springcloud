package fun.lww.consulconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("consumer")
    public String dc() {
        String url = "http://consulclient/dc";
        return restTemplate.getForObject(url, String.class);
    }

}
