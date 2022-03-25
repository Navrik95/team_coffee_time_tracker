package teamcoffee.accountant.dao;

import teamcoffee.accountant.entity.Task;

import java.util.List;

public interface TaskDao {

    Task findById(int id);

    List<Task> findAll();

    void save(Task task);

    void update(Task task);

    void delete(int id);
}
