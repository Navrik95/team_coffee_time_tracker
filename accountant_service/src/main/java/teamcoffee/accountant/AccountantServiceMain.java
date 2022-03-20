package teamcoffee.accountant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountantServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(AccountantServiceMain.class, args);
    }
}
