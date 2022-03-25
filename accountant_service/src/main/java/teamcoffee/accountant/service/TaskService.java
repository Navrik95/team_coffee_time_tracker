package teamcoffee.accountant.service;

public interface TaskService {

    String getAllTasks();

    String getTaskById(int id);

    void saveNew(String jsonTask);

    void update(String jsonTask);

    void delete(int id);

}
