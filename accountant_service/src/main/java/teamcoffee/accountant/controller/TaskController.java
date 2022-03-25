package teamcoffee.accountant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import teamcoffee.accountant.service.ServiceFactory;
import teamcoffee.accountant.service.TaskService;

@Controller
@RequestMapping("/tasks")
@ResponseBody
public class TaskController {

    private TaskService taskService = ServiceFactory.getTaskService();

    @RequestMapping(method = RequestMethod.GET,
                    headers = {"Accept = application/json"})
    public String getTaskList(){

        return "Hello !";
    }
}
