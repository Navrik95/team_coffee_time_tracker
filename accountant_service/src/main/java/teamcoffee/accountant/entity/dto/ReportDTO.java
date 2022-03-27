package teamcoffee.accountant.entity.dto;

import java.util.List;
import java.util.Objects;

public class ReportDTO {

    private int id;
    private long date;
    private long fullTime;
    private long userChatId;
    private List<TrackingDTO> dayTrackings;

    public ReportDTO() {
    }

    public ReportDTO(int id, long date, long fullTime, long userChatId, List<TrackingDTO> dayTrackings) {
        this.id = id;
        this.date = date;
        this.fullTime = fullTime;
        this.userChatId = userChatId;
        this.dayTrackings = dayTrackings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getFullTime() {
        return fullTime;
    }

    public void setFullTime(long fullTime) {
        this.fullTime = fullTime;
    }

    public long getUserChatId() {
        return userChatId;
    }

    public void setUserChatId(long userChatId) {
        this.userChatId = userChatId;
    }

    public List<TrackingDTO> getDayTrackings() {
        return dayTrackings;
    }

    public void setDayTrackings(List<TrackingDTO> dayTrackings) {
        this.dayTrackings = dayTrackings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReportDTO reportDTO = (ReportDTO) o;
        return id == reportDTO.id && date == reportDTO.date && fullTime == reportDTO.fullTime && userChatId == reportDTO.userChatId && Objects.equals(dayTrackings, reportDTO.dayTrackings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, fullTime, userChatId, dayTrackings);
    }

    @Override
    public String toString() {
        return "ReportDTO{" +
                "id=" + id +
                ", date=" + date +
                ", fullTime=" + fullTime +
                ", userChatId=" + userChatId +
                ", dayTrackings=" + dayTrackings +
                '}';
    }
}
