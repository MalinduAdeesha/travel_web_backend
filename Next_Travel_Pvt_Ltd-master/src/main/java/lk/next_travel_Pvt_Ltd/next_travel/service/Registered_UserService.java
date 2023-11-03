package lk.next_travel_Pvt_Ltd.next_travel.service;

import lk.next_travel_Pvt_Ltd.next_travel.dto.PackageDTO;
import lk.next_travel_Pvt_Ltd.next_travel.dto.Registered_UserDTO;

public interface Registered_UserService {

    void saveRegisteredUser(Registered_UserDTO registered_userDTO);
    Registered_UserDTO getSelectedRegisteredUser(String user_Id);
    void updateRegisteredUser(Registered_UserDTO registered_userDTO);
    void deleteRegisteredUser(String user_Id);

}
