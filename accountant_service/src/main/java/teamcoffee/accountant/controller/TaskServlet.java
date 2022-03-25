package teamcoffee.accountant.controller;

import teamcoffee.accountant.service.ServiceFactory;
import teamcoffee.accountant.service.TaskService;
import teamcoffee.accountant.util.RequestParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TaskServlet", value = "/tasks/*")
public class TaskServlet extends HttpServlet {

    private final TaskService taskService = ServiceFactory.getTaskService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();

        if (RequestParser.requestHasId(req.getRequestURI())){
            int id = RequestParser.parseIdFromRequest(req.getRequestURI());
            writer.write(taskService.getTaskById(id));
        } else {
            writer.write(taskService.getAllTasks());
        }
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        if (!RequestParser.requestHasId(req.getRequestURI())){
            String jsonTask = RequestParser.readJsonFromRequest(req.getReader());
            if (!jsonTask.isEmpty()){
                taskService.saveNew(jsonTask);
            }
        }

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        String jsonTask = RequestParser.readJsonFromRequest(req.getReader());
        if (!jsonTask.isEmpty()){
            taskService.update(jsonTask);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        if (RequestParser.requestHasId(req.getRequestURI())){
            int id = RequestParser.parseIdFromRequest(req.getRequestURI());
            taskService.delete(id);
        }
    }
}
