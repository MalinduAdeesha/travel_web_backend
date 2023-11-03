package lk.next_travel_Pvt_Ltd.next_travel.api;

import lk.next_travel_Pvt_Ltd.next_travel.dto.GuideDTO;
import lk.next_travel_Pvt_Ltd.next_travel.service.GuideService;
import lk.next_travel_Pvt_Ltd.next_travel.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/guideService")
@CrossOrigin
public class GuideServiceController {

    private final GuideService service;

    public GuideServiceController(GuideService service) {
        this.service = service;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveGuide(@RequestBody GuideDTO guideDTO) {

        service.saveGuide(guideDTO);
        return new ResponseUtil(201, "Guide Added..", null);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateGuide(@RequestBody GuideDTO guideDTO) {

        service.updateGuide(guideDTO);
        return new ResponseUtil(202, "Guide Updated..", null);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{guide_Id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteGuide(@PathVariable String guide_Id) {

        service.deleteGuide(guide_Id);
        return new ResponseUtil(200, "Guide Deleted..", null);

    }

}
