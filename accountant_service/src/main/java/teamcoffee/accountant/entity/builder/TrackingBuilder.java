package teamcoffee.accountant.entity.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import teamcoffee.accountant.entity.Tracking;
import teamcoffee.accountant.entity.dto.TrackingDTO;

@Component
public class TrackingBuilder {

    @Autowired
    private TaskBuilder taskBuilder;

    public TrackingDTO buildDTO(Tracking tracking){
        TrackingDTO dto = new TrackingDTO();
        dto.setId(tracking.getId());
        dto.setStartTime(tracking.getStartTime());
        dto.setEndTime(tracking.getEndTime());
        dto.setNote(tracking.getNote());
        dto.setUserChatId(tracking.getUserChatId());
        dto.setTask(taskBuilder.buildDTO(tracking.getTask()));
        return dto;
    }

    public Tracking build(TrackingDTO dto){
        Tracking tracking = new Tracking();
        tracking.setId(dto.getId());
        tracking.setStartTime(dto.getStartTime());
        tracking.setEndTime(dto.getEndTime());
        tracking.setNote(dto.getNote());
        tracking.setUserChatId(dto.getUserChatId());
        tracking.setTask(taskBuilder.build(dto.getTask()));
        return tracking;
    }
}
