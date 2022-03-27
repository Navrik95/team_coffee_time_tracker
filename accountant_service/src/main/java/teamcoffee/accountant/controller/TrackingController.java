package teamcoffee.accountant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teamcoffee.accountant.service.TrackingService;
import teamcoffee.accountant.entity.dto.TrackingDTO;

import java.util.List;

@RestController
@RequestMapping("/trackings")
@ResponseBody
public class TrackingController {

    @Autowired
    private TrackingService trackingService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TrackingDTO displayTrackingById(@PathVariable("id") int id){
        return trackingService.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<TrackingDTO> displayAllTrackings(){
        return trackingService.getAll();
    }

    @RequestMapping(value = "/user/{chatId}", method = RequestMethod.GET)
    public List<TrackingDTO> displayTrackingsByUserChatId(@PathVariable("chatId") long chatId){
        return trackingService.getByChatId(chatId);
    }

}
