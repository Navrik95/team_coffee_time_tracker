package teamcoffee.accountant.service;


import teamcoffee.accountant.service.impl.ReportServiceImpl;
import teamcoffee.accountant.service.impl.TaskServiceImpl;

public class ServiceFactory {

    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final ReportService reportService = new ReportServiceImpl();
    private final TaskService taskService = new TaskServiceImpl();

    private ServiceFactory() {
    }

    public static ReportService getReportService() {
        return INSTANCE.reportService;
    }

    public static TaskService getTaskService() {
        return INSTANCE.taskService;
    }

}
