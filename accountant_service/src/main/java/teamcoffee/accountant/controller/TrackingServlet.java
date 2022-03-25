package teamcoffee.accountant.controller;

import com.andersen.team_coffee.accountant.service.ServiceFactory;
import com.andersen.team_coffee.accountant.service.TrackingService;
import com.andersen.team_coffee.accountant.util.RequestParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TrackingServlet", value = "/trackings/*")
public class TrackingServlet extends HttpServlet {

    private final TrackingService trackingService = ServiceFactory.getTrackingService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();

        if (RequestParser.requestHasId(req.getRequestURI())) {
            int id = RequestParser.parseIdFromRequest(req.getRequestURI());
            writer.write(trackingService.getById(id));
        } else {
            writer.write(trackingService.getAll());
        }
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        if (!RequestParser.requestHasId(req.getRequestURI())){
            String jsonTracking = RequestParser.readJsonFromRequest(req.getReader());
            if (!jsonTracking.isEmpty()){
                trackingService.saveNew(jsonTracking);
            }
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        String jsonTracking = RequestParser.readJsonFromRequest(req.getReader());
        if (!jsonTracking.isEmpty()){
            trackingService.update(jsonTracking);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        if (RequestParser.requestHasId(req.getRequestURI())){
            int id = RequestParser.parseIdFromRequest(req.getRequestURI());
            trackingService.delete(id);
        }
    }
}
