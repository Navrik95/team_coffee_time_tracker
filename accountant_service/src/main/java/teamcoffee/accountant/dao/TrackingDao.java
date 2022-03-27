package teamcoffee.accountant.dao;

import teamcoffee.accountant.entity.Tracking;

import java.util.List;

public interface TrackingDao{

    Tracking findById(int id);

    List<Tracking> findAll();

    List<Tracking> findByUserChatId(long userChatId);

    List<Tracking> findByUserChatIdAndTimeInterval(long userChatId, long intervalStart, long intervalEnd);

    void save(Tracking tracking);

    void update(Tracking tracking);

    void delete(int id);
}
