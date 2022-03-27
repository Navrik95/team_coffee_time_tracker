package teamcoffee.accountant.entity.dto;

import teamcoffee.accountant.entity.Tracking;

import java.util.Objects;

public class TrackingDTO {

    private int id;
    private long startTime;
    private long endTime;
    private String note;
    private long userChatId;
    private TaskDTO task;

    public TrackingDTO() {
    }

    public TrackingDTO(int id, long startTime, long endTime, String note, long userChatId, TaskDTO task) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.note = note;
        this.userChatId = userChatId;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public long getUserChatId() {
        return userChatId;
    }

    public void setUserChatId(long userChatId) {
        this.userChatId = userChatId;
    }

    public TaskDTO getTask() {
        return task;
    }

    public void setTask(TaskDTO task) {
        this.task = task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackingDTO that = (TrackingDTO) o;
        return id == that.id && startTime == that.startTime && endTime == that.endTime && userChatId == that.userChatId && Objects.equals(note, that.note) && Objects.equals(task, that.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, endTime, note, userChatId, task);
    }

    @Override
    public String toString() {
        return "TrackingDTO{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", note='" + note + '\'' +
                ", userChatId=" + userChatId +
                ", task=" + task +
                '}';
    }
}
