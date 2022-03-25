package teamcoffee.accountant.service.impl;

import com.google.gson.Gson;
import teamcoffee.accountant.dao.DaoFactory;
import teamcoffee.accountant.dao.ReportDao;
import teamcoffee.accountant.dao.TrackingDao;
import teamcoffee.accountant.entity.Report;
import teamcoffee.accountant.entity.Tracking;
import teamcoffee.accountant.service.ReportService;

import java.util.List;

public class ReportServiceImpl implements ReportService {

    private static final long MILLIS_ID_DAY = 86_400_000L;
    private final TrackingDao trackingDao = DaoFactory.getTrackingDao();
    private final ReportDao reportDao = DaoFactory.getReportDao();
    private final Gson gson = new Gson();

    @Override
    public String getById(int id) {
        Report report = reportDao.findById(id);
        String reportJson = gson.toJson(report);
        return reportJson;
    }

    @Override
    public String getAll() {
        List<Report> reportList = reportDao.findAll();
        String reportListJson = gson.toJson(reportList);
        return reportListJson;
    }

    @Override
    public String getAllByChatId(long chatId) {
        List<Report> reportList = reportDao.findByUserCharId(chatId);
        String reportListJson = gson.toJson(reportList);
        return reportListJson;
    }

    @Override
    public String getLastUserReport(long chatId) {
        Report report = reportDao.findLastUserReport(chatId);
        long startInterval ;
        long endInterval = System.currentTimeMillis();
        if (report.getDate() < (startInterval = endInterval - MILLIS_ID_DAY)){
            report = createNewDayReport(chatId, startInterval, endInterval);
        }
        String reportJson = gson.toJson(report);
        return reportJson;
    }

    @Override
    public void saveNew(String jsonReport) {
        Report report = gson.fromJson(jsonReport, Report.class);
        reportDao.save(report);
    }

    @Override
    public void update(String jsonReport) {
        Report report = gson.fromJson(jsonReport, Report.class);
        reportDao.update(report);
    }

    @Override
    public void delete(int id) {
        reportDao.delete(id);
    }

    private Report createNewDayReport(long chatId, long startInterval, long endInterval) {
        Report report;
        report = new Report();
        report.setDate(System.currentTimeMillis());
        report.setUserChatId(chatId);
        List<Tracking> trackingsOfTheDay =
                trackingDao.findByUserChatIdAndTimeInterval(chatId, startInterval, endInterval);
        report.setDayTrackings(trackingsOfTheDay);
        report.setFullTime(calculateFullTime(report));
        return report;
    }

    private long calculateFullTime(Report report) {
        long fullTime = 0;
        for (Tracking tracking : report.getDayTrackings()){
            fullTime += tracking.getEndTime() - tracking.getStartTime();
        }
        return fullTime;
    }
}
