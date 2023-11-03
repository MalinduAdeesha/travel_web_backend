package lk.next_travel_Pvt_Ltd.next_travel.api;

import lk.next_travel_Pvt_Ltd.next_travel.dto.UserDTO;
import lk.next_travel_Pvt_Ltd.next_travel.dto.VehicleDTO;
import lk.next_travel_Pvt_Ltd.next_travel.service.VehicleService;
import lk.next_travel_Pvt_Ltd.next_travel.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vehicleService")
@CrossOrigin
public class VehicleServiceController {

    private final VehicleService service;

    public VehicleServiceController(VehicleService service) {
        this.service = service;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveVehicle(@RequestBody VehicleDTO vehicleDTO) {

        service.saveVehicle(vehicleDTO);
        return new ResponseUtil(201, "Vehicle Added..", null);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateVehicle(@RequestBody VehicleDTO vehicleDTO) {

        service.updateVehicle(vehicleDTO);
        return new ResponseUtil(202, "Vehicle Updated..", null);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{vehicle_Id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteVehicle(@PathVariable String vehicle_Id) {

        service.deleteVehicle(vehicle_Id);
        return new ResponseUtil(200, "Vehicle Deleted..", null);

    }

}
