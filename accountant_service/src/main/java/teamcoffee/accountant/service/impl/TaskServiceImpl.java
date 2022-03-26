package teamcoffee.accountant.service.impl;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teamcoffee.accountant.dao.TaskDao;
import teamcoffee.accountant.dto.TaskDTO;
import teamcoffee.accountant.entity.Task;
import teamcoffee.accountant.service.TaskService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;
    @Autowired
    private Gson gson;

    @Override
    public  List<TaskDTO> getAllTasks() {
        List<Task> taskList = taskDao.findAll();
        return taskList.stream()
                .map(TaskDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public TaskDTO getTaskById(int id) {
        Task task = taskDao.findById(id);
        return new TaskDTO(task);
    }

    @Override
    public void saveNew(TaskDTO taskDTO) {
        Task task = new Task(taskDTO.getId(), taskDTO.getName(), taskDTO.getNote());
        taskDao.save(task);
        taskDTO.setId(task.getId());
    }

    @Override
    public void update(int id, TaskDTO taskDTO) {
        Task task = new Task(id, taskDTO.getName(), taskDTO.getNote());
        taskDao.update(task);
    }

    @Override
    public void delete(int id) {
        taskDao.delete(id);
    }
}
