package teamcoffee.accountant.dao;

import teamcoffee.accountant.entity.Report;

import java.util.List;

public interface ReportDao {

    Report findById(int id);

    List<Report> findAll();

    List<Report> findByUserCharId(long userChatId);

    Report findLastUserReport(long userChatId);

    void save(Report report);

    void update(Report report);

    void delete(int id);
}
