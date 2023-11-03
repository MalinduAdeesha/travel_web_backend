package lk.next_travel_Pvt_Ltd.next_travel.api;

import lk.next_travel_Pvt_Ltd.next_travel.dto.AdminDTO;
import lk.next_travel_Pvt_Ltd.next_travel.dto.HotelDTO;
import lk.next_travel_Pvt_Ltd.next_travel.service.HotelService;
import lk.next_travel_Pvt_Ltd.next_travel.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hotelService")
@CrossOrigin
public class HotelServiceController {

    private final HotelService service;

    public HotelServiceController(HotelService service) {
        this.service = service;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveHotel(@RequestBody HotelDTO hotelDTO) {

        service.saveHotel(hotelDTO);
        return new ResponseUtil(201, "Hotel Added..", null);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateHotel(@RequestBody HotelDTO hotelDTO) {

        service.updateHotel(hotelDTO);
        return new ResponseUtil(202, "Hotel Updated..", null);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{hotel_Id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteHotel(@PathVariable String hotel_Id) {

        service.deleteHotel(hotel_Id);
        return new ResponseUtil(200, "Hotel Deleted..", null);

    }

}
