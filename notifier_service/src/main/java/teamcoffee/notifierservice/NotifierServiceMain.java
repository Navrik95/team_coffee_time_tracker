package teamcoffee.notifierservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class NotifierServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(NotifierServiceMain.class, args);
    }
}
