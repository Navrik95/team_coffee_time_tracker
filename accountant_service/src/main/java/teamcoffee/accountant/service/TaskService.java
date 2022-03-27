package teamcoffee.accountant.service;

import teamcoffee.accountant.entity.dto.TaskDTO;

import java.util.List;

public interface TaskService {

    List<TaskDTO> getAllTasks();

    TaskDTO getTaskById(int id);

    void saveNew(TaskDTO taskDTO);

    void update(int id, TaskDTO taskDTO);

    void delete(int id);

}
