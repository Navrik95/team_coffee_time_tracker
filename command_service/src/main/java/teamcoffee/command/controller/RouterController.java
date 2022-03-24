package teamcoffee.command.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface RouterController {
    @RequestMapping("/response")
    String response();
}
