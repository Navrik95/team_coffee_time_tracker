package teamcoffee.accountant.service.impl;

import com.google.gson.Gson;
import teamcoffee.accountant.dao.DaoFactory;
import teamcoffee.accountant.dao.TrackingDao;
import teamcoffee.accountant.entity.Tracking;
import teamcoffee.accountant.service.TrackingService;

import java.util.List;

public class TrackingServiceImpl implements TrackingService {

    private final TrackingDao trackingDao = DaoFactory.getTrackingDao();
    private final Gson gson = new Gson();

    @Override
    public String getById(int id) {
        Tracking tracking = trackingDao.findById(id);
        String jsonTracking = gson.toJson(tracking);
        return jsonTracking;
    }

    @Override
    public String getAll() {
        List<Tracking> trackingList = trackingDao.findAll();
        String jsonTrackingList = gson.toJson(trackingList);
        return jsonTrackingList;
    }

    @Override
    public String getByChatId(String jsonChatId) {
        return null;
    }

    @Override
    public String getByChatIdAndDate(String jsonChatId, String date) {
        return null;
    }

    @Override
    public void saveNew(String jsonTracking) {
        Tracking tracking = gson.fromJson(jsonTracking, Tracking.class);
        trackingDao.save(tracking);
    }

    @Override
    public void update(String jsonTracking) {
        Tracking tracking = gson.fromJson(jsonTracking, Tracking.class);
        trackingDao.update(tracking);
    }

    @Override
    public void delete(int id) {
        trackingDao.delete(id);
    }
}
