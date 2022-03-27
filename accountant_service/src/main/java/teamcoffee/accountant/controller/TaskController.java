package teamcoffee.accountant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import teamcoffee.accountant.entity.dto.TaskDTO;
import teamcoffee.accountant.service.TaskService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/tasks")
@ResponseBody
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(method = RequestMethod.GET)
    public List<TaskDTO> displayAllTasks() {
        return taskService.getAllTasks();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TaskDTO displayTaskById(@PathVariable("id") int id) {

        return taskService.getTaskById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public TaskDTO createTask(@RequestBody TaskDTO taskDTO,
                              BindingResult result,
                              HttpServletResponse response)
            throws BindException {
        if (result.hasErrors()) {
            throw new BindException(result);
        }

        taskService.saveNew(taskDTO);
        response.setHeader("Location", "/tasks/" + taskDTO.getId());
        return taskDTO;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable("id") int id) {
        taskService.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void putTask(@PathVariable("id") int id,
                        @RequestBody TaskDTO taskDTO) {
        taskService.update(id, taskDTO);
    }
}
