package teamcoffee.accountant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teamcoffee.accountant.dao.TaskDao;
import teamcoffee.accountant.entity.builder.TaskBuilder;
import teamcoffee.accountant.entity.dto.TaskDTO;
import teamcoffee.accountant.entity.Task;
import teamcoffee.accountant.service.TaskService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;
    @Autowired
    private TaskBuilder builder;

    @Override
    public  List<TaskDTO> getAllTasks() {
        List<Task> taskList = taskDao.findAll();
        return taskList.stream()
                .map(builder::buildDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TaskDTO getTaskById(int id) {
        Task task = taskDao.findById(id);
        return builder.buildDTO(task);
    }

    @Override
    public void saveNew(TaskDTO taskDTO) {
        Task task = builder.build(taskDTO);
        taskDao.save(task);
        taskDTO.setId(task.getId());
    }

    @Override
    public void update(int id, TaskDTO taskDTO) {
        taskDTO.setId(id);
        Task task = builder.build(taskDTO);
        taskDao.update(task);
    }

    @Override
    public void delete(int id) {
        taskDao.delete(id);
    }
}
