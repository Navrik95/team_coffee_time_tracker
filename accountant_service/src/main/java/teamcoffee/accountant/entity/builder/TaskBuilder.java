package teamcoffee.accountant.entity.builder;

import org.springframework.stereotype.Component;
import teamcoffee.accountant.entity.Task;
import teamcoffee.accountant.entity.dto.TaskDTO;

@Component
public class TaskBuilder {

    public TaskDTO buildDTO(Task task){
        return new TaskDTO(task.getId(), task.getName(), task.getNote());
    }

    public Task build(TaskDTO taskDTO){
        return new Task(taskDTO.getId(), taskDTO.getName(), taskDTO.getNote());
    }
}
