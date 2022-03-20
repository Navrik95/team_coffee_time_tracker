package teamcoffee.routerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RouterServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(RouterServiceMain.class, args);
    }
}
