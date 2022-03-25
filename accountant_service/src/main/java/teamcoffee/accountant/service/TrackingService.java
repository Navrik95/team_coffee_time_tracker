package teamcoffee.accountant.service;

public interface TrackingService {

    String getById(int id);

    String getAll();

    String getByChatId(String jsonChatId);

    String getByChatIdAndDate(String jsonChatId, String date);

    void saveNew(String jsonTracking);

    void update(String jsonTracking);

    void delete(int id);
}
