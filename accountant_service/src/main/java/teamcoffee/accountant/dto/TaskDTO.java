package teamcoffee.accountant.dto;

import teamcoffee.accountant.entity.Task;

import java.util.Objects;

public class TaskDTO {

    private int id;
    private String name;
    private String note;

    public TaskDTO() {
    }

    public TaskDTO(int id, String name, String note) {
        this.id = id;
        this.name = name;
        this.note = note;
    }

    public TaskDTO(Task task) {
        this.id = task.getId();
        this.name = task.getName();
        this.note = task.getNote();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskDTO taskDTO = (TaskDTO) o;
        return id == taskDTO.id && Objects.equals(name, taskDTO.name) && Objects.equals(note, taskDTO.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, note);
    }

    @Override
    public String toString() {
        return "TaskDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
