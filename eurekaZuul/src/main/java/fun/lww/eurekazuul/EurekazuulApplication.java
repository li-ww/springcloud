package fun.lww.eurekazuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class EurekazuulApplication {

    @Bean
    Filter filter() {
        return new Filter();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekazuulApplication.class, args);
    }
}
