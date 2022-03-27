package teamcoffee.accountant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamcoffee.accountant.entity.Tracking;

import java.util.List;

@Repository
public interface TrackingSData extends JpaRepository<Tracking, Integer> {

    List<Tracking> findByUserChatId(Long chatId);

    List<Tracking> findByUserChatIdAndStartTimeAfterAndEndTimeBefore(Long userChatId, Long startTime, Long endTime);
}
