package teamcoffee.accountant.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "trackings")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tracking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tr_ id")
    private int id;

    @Column(name = "tr_start_time")
    private long startTime;

    @Column(name = "tr_end_time")
    private long endTime;

    @Column(name = "tr_note")
    private String note;

    @Column(name = "tr_u_chat_id")
    private long userChatId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tr_task_id")
    private Task task;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tracking tracking = (Tracking) o;
        return id == tracking.id &&
                startTime == tracking.startTime &&
                endTime == tracking.endTime &&
                userChatId == tracking.userChatId &&
                Objects.equals(note, tracking.note) &&
                Objects.equals(task, tracking.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, endTime, note, userChatId, task);
    }

    @Override
    public String toString() {
        return "Tracking{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", note='" + note + '\'' +
                ", userChatId=" + userChatId +
                ", task=" + task +
                '}';
    }
}
