package lk.next_travel_Pvt_Ltd.next_travel.api;

import lk.next_travel_Pvt_Ltd.next_travel.dto.AdminDTO;
import lk.next_travel_Pvt_Ltd.next_travel.service.AdminService;
import lk.next_travel_Pvt_Ltd.next_travel.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/adminService")
@CrossOrigin
public class AdminController {

    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveAdmin(@RequestBody AdminDTO adminDTO) {

        service.saveAdmin(adminDTO);
        return new ResponseUtil(201, "Admin Added..", null);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateAdmin(@RequestBody AdminDTO adminDTO) {

        service.updateAdmin(adminDTO);
        return new ResponseUtil(202, "Admin Updated..", null);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{admin_Id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteAdmin(@PathVariable String admin_Id) {

        service.deleteAdmin(admin_Id);
        return new ResponseUtil(200, "Admin Deleted..", null);

    }

}
