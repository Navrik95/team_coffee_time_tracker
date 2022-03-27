package teamcoffee.accountant.service;

import teamcoffee.accountant.entity.dto.TrackingDTO;

import java.util.List;

public interface TrackingService {

    TrackingDTO getById(int id);

    List<TrackingDTO> getAll();

    List<TrackingDTO> getByChatId(long chatId);

    List<TrackingDTO> getByChatIdAndDate(long chatId, String date);

    void saveNew(TrackingDTO trackingDTO);

    void update(int id, TrackingDTO trackingDTO);

    void delete(int id);
}
