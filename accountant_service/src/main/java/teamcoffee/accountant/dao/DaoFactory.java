package teamcoffee.accountant.dao;


import teamcoffee.accountant.dao.impl.ReportDaoImpl;
import teamcoffee.accountant.dao.impl.TaskDaoImpl;
import teamcoffee.accountant.dao.impl.TrackingDaoImpl;

public class DaoFactory {

    private static final TaskDao taskDao = new TaskDaoImpl();
    private static final TrackingDao trackingDao = new TrackingDaoImpl();
    private static final ReportDao reportDao = new ReportDaoImpl();

    public static TaskDao getTaskDao() {
        return taskDao;
    }

    public static TrackingDao getTrackingDao() {
        return trackingDao;
    }

    public static ReportDao getReportDao() {
        return reportDao;
    }
}
