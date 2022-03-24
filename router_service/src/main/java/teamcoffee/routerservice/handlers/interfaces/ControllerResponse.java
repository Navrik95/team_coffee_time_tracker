package teamcoffee.routerservice.handlers.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@FeignClient("command-service")
public interface ControllerResponse {
    @RequestMapping("/response")
    String response();
}
