package fun.lww.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Value("${username}")
    String username;

    @Value("${password}")
    String password;

    @GetMapping("/user")
    public String getUser() {
        return "username:" + username + "<br />password:" + password;
    }
}
