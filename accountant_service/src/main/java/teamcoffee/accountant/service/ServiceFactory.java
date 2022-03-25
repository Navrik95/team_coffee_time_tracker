package teamcoffee.accountant.service;


import teamcoffee.accountant.service.impl.ReportServiceImpl;
import teamcoffee.accountant.service.impl.TaskServiceImpl;
import teamcoffee.accountant.service.impl.TrackingServiceImpl;

public class ServiceFactory {

    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final ReportService reportService = new ReportServiceImpl();
    private final TaskService taskService = new TaskServiceImpl();
    private final TrackingService trackingService = new TrackingServiceImpl();

    private ServiceFactory() {
    }

    public static ReportService getReportService() {
        return INSTANCE.reportService;
    }

    public static TaskService getTaskService() {
        return INSTANCE.taskService;
    }

    public static TrackingService getTrackingService() {
        return INSTANCE.trackingService;
    }
}
