package lk.next_travel_Pvt_Ltd.next_travel.api;

import lk.next_travel_Pvt_Ltd.next_travel.dto.Registered_UserDTO;
import lk.next_travel_Pvt_Ltd.next_travel.dto.UserDTO;
import lk.next_travel_Pvt_Ltd.next_travel.service.UserService;
import lk.next_travel_Pvt_Ltd.next_travel.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/userService")
@CrossOrigin
public class UserServiceController {

    private final UserService service;

    public UserServiceController(UserService service) {
        this.service = service;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveUser(@RequestBody UserDTO userDTO) {

        service.saveUser(userDTO);
        return new ResponseUtil(201, "User Added..", null);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateUser(@RequestBody UserDTO userDTO) {

        service.updateUser(userDTO);
        return new ResponseUtil(202, "User Updated..", null);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{user_Id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteUser(@PathVariable String user_Id) {

        service.deleteUser(user_Id);
        return new ResponseUtil(200, "User Deleted..", null);

    }

}
