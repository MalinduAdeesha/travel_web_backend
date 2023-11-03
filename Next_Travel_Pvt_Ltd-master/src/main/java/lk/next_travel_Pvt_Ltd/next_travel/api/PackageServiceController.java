package lk.next_travel_Pvt_Ltd.next_travel.api;

import lk.next_travel_Pvt_Ltd.next_travel.dto.HotelDTO;
import lk.next_travel_Pvt_Ltd.next_travel.dto.PackageDTO;
import lk.next_travel_Pvt_Ltd.next_travel.service.PackageService;
import lk.next_travel_Pvt_Ltd.next_travel.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/packageService")
@CrossOrigin
public class PackageServiceController {

    private final PackageService service;

    public PackageServiceController(PackageService service) {
        this.service = service;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil savePackage(@RequestBody PackageDTO packageDTO) {

        service.savePackage(packageDTO);
        return new ResponseUtil(201, "Package Added..", null);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updatePackage(@RequestBody PackageDTO packageDTO) {

        service.updatePackage(packageDTO);
        return new ResponseUtil(202, "Package Updated..", null);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{package_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deletePackage(@PathVariable String package_id) {

        service.deletePackage(package_id);
        return new ResponseUtil(200, "Package Deleted..", null);

    }

}
