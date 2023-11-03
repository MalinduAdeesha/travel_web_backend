package lk.next_travel_Pvt_Ltd.next_travel.api;

import lk.next_travel_Pvt_Ltd.next_travel.dto.Registered_UserDTO;
import lk.next_travel_Pvt_Ltd.next_travel.service.Registered_UserService;
import lk.next_travel_Pvt_Ltd.next_travel.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/registeredUser")
@CrossOrigin
public class Registered_UserController {

    private final Registered_UserService service;

    public Registered_UserController(Registered_UserService service) {
        this.service = service;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveRegisteredUser(@RequestBody Registered_UserDTO registered_userDTO) {

        service.saveRegisteredUser(registered_userDTO);
        return new ResponseUtil(201, "Registered User Added..", null);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateRegisteredUser(@RequestBody Registered_UserDTO registered_userDTO) {

        service.updateRegisteredUser(registered_userDTO);
        return new ResponseUtil(202, "Registered User Updated..", null);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{user_Id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteRegisteredUser(@PathVariable String user_Id) {

        service.deleteRegisteredUser(user_Id);
        return new ResponseUtil(200, "Registered User Deleted..", null);

    }

}
