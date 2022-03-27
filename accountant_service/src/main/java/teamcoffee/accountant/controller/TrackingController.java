package teamcoffee.accountant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import teamcoffee.accountant.service.TrackingService;
import teamcoffee.accountant.entity.dto.TrackingDTO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/trackings")
@ResponseBody
public class TrackingController {

    @Autowired
    private TrackingService trackingService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TrackingDTO displayTrackingById(@PathVariable("id") int id) {
        return trackingService.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<TrackingDTO> displayAllTrackings() {
        return trackingService.getAll();
    }

    @RequestMapping(value = "/users/{chatId}", method = RequestMethod.GET)
    public List<TrackingDTO> displayTrackingsByUserChatId(@PathVariable("chatId") long chatId) {
        return trackingService.getByChatId(chatId);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public TrackingDTO createTracking(@RequestBody TrackingDTO trackingDTO,
                               BindingResult result,
                               HttpServletResponse response)
            throws BindException {
        if (result.hasErrors()) {
            throw new BindException(result);
        }

        trackingService.saveNew(trackingDTO);
        response.setHeader("Location", "/trackings/" + trackingDTO.getId());
        return trackingDTO;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTracking(@PathVariable("id") int id) {
        trackingService.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void putTask(@PathVariable("id") int id,
                        @RequestBody TrackingDTO trackingDTO) {
        trackingService.update(id, trackingDTO);
    }

}
