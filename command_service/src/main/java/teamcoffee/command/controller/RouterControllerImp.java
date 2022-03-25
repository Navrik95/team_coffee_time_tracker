package teamcoffee.command.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouterControllerImp implements RouterController{
    @Autowired
    @Lazy
   private EurekaClient eurekaClient;

    @Override
    public String response() {
        return "Hello";
    }

}
