package teamcoffee.command;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class CommandServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(CommandServiceMain.class, args);
    }
}
