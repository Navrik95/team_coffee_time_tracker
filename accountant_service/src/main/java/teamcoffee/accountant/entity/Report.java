package teamcoffee.accountant.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "reports")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rep_id")
    private int id;

    @Column(name = "rep_date")
    private long date;

    @Column(name = "rep_full_time")
    private long fullTime;

    @Column(name = "rep_u_chat_id")
    private long userChatId;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "reports_x_trackings",
            joinColumns = @JoinColumn(name = "rxt_report_id"),
            inverseJoinColumns = @JoinColumn(name = "rxt_tracking_id"))
    private List<Tracking> dayTrackings;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Report report = (Report) o;
        return id == report.id &&
                date == report.date &&
                fullTime == report.fullTime &&
                userChatId == report.userChatId &&
                equalDayTrackings(report.getDayTrackings());
    }

    private boolean equalDayTrackings(List<Tracking> that) {
        if (dayTrackings.size() != that.size()) {
            return false;
        }
        for (int i = 0; i < dayTrackings.size(); i++) {
            if (!dayTrackings.get(i).equals(that.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, fullTime, userChatId, dayTrackings);
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", date=" + date +
                ", fullTime=" + fullTime +
                ", userChatId=" + userChatId +
                ", dayTrackings=" + dayTrackings +
                '}';
    }
}
