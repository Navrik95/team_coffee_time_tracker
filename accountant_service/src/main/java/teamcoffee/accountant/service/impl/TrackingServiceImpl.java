package teamcoffee.accountant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teamcoffee.accountant.dao.TrackingSData;
import teamcoffee.accountant.entity.builder.TrackingBuilder;
import teamcoffee.accountant.entity.dto.TrackingDTO;
import teamcoffee.accountant.entity.Tracking;
import teamcoffee.accountant.service.TrackingService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrackingServiceImpl implements TrackingService {

    @Autowired
    private TrackingSData trackingDao;
    @Autowired
    private TrackingBuilder builder;

    public TrackingDTO getById(int id){
        Tracking tracking = trackingDao.getById(id);
        return builder.buildDTO(tracking);
    }

    public List<TrackingDTO> getByChatId(long userId){
        List<Tracking> trackingList = trackingDao.findByUserChatId(userId);
        return trackingList.stream()
                .map(builder::buildDTO)
                .collect(Collectors.toList());
    }

    public List<TrackingDTO> getAll() {
        List<Tracking> trackingList = trackingDao.findAll();
        return trackingList.stream()
                .map(builder::buildDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<TrackingDTO> getByChatIdAndDate(long chatId, long date) {
        return null;
    }

    @Override
    public void saveNew(TrackingDTO trackingDTO) {
        Tracking tracking = builder.build(trackingDTO);
        trackingDao.save(tracking);
        trackingDTO.setId(tracking.getId());
    }

    @Override
    public void update(int id, TrackingDTO trackingDTO) {
        trackingDTO.setId(id);
        Tracking tracking = builder.build(trackingDTO);
        trackingDao.save(tracking);
    }

    @Override
    public void deleteById(int id) {
        trackingDao.deleteById(id);
    }
}
