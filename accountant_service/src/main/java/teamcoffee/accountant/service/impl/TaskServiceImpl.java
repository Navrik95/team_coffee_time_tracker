package teamcoffee.accountant.service.impl;

import com.google.gson.Gson;
import teamcoffee.accountant.dao.DaoFactory;
import teamcoffee.accountant.dao.TaskDao;
import teamcoffee.accountant.entity.Task;
import teamcoffee.accountant.service.TaskService;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    private final TaskDao taskDao = DaoFactory.getTaskDao();
    private final Gson gson = new Gson();

    @Override
    public String getAllTasks() {
        List<Task> taskList = taskDao.findAll();
        String jsonTaskList = gson.toJson(taskList);
        return jsonTaskList;
    }

    @Override
    public String getTaskById(int id) {
        Task task = taskDao.findById(id);
        String jsonTask = gson.toJson(task);
        return jsonTask;
    }

    @Override
    public void saveNew(String jsonTask) {
        Task task = gson.fromJson(jsonTask, Task.class);
        taskDao.save(task);
    }

    @Override
    public void update(String jsonTask) {
        Task task = gson.fromJson(jsonTask, Task.class);
        taskDao.update(task);
    }

    @Override
    public void delete(int id) {
        taskDao.delete(id);
    }
}
