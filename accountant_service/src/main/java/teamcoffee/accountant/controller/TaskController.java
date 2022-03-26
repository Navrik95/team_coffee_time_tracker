package teamcoffee.accountant.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import teamcoffee.accountant.dao.DaoFactory;
import teamcoffee.accountant.entity.Task;
import teamcoffee.accountant.service.ServiceFactory;
import teamcoffee.accountant.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@ResponseBody
public class TaskController {

    private TaskService taskService = ServiceFactory.getTaskService();

    @RequestMapping(method = RequestMethod.GET)
    public List<Task> getTaskList(){

        return DaoFactory.getTaskDao().findAll();
    }
}
