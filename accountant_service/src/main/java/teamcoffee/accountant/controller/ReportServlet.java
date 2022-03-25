package teamcoffee.accountant.controller;

import teamcoffee.accountant.service.ReportService;
import teamcoffee.accountant.service.ServiceFactory;
import teamcoffee.accountant.util.RequestParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ReportServlet", value = "/reports/*")
public class ReportServlet extends HttpServlet {

    private final ReportService reportService = ServiceFactory.getReportService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();

        if (RequestParser.requestHasId(req.getRequestURI())){
            int id = RequestParser.parseIdFromRequest(req.getRequestURI());
            writer.write(reportService.getById(id));
        } else {
            writer.write(reportService.getAll());
        }
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        if (!RequestParser.requestHasId(req.getRequestURI())){
            String jsonReport = RequestParser.readJsonFromRequest(req.getReader());
            if (!jsonReport.isEmpty()){
                reportService.saveNew(jsonReport);
            }
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        String jsonReport = RequestParser.readJsonFromRequest(req.getReader());
        if (!jsonReport.isEmpty()){
            reportService.update(jsonReport);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        if (RequestParser.requestHasId(req.getRequestURI())){
            int id = RequestParser.parseIdFromRequest(req.getRequestURI());
            reportService.delete(id);
        }
    }
}
