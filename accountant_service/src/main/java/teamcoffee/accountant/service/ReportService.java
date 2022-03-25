package teamcoffee.accountant.service;

public interface ReportService {

    String getById(int id);

    String getAll();

    String getAllByChatId(long chatId);

    String getLastUserReport(long chatId);

    void saveNew(String jsonReport);

    void update(String jsonReport);

    void delete(int id);
}
