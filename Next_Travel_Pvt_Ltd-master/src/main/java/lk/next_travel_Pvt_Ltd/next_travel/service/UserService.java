package lk.next_travel_Pvt_Ltd.next_travel.service;

import lk.next_travel_Pvt_Ltd.next_travel.dto.UserDTO;

public interface UserService {

    void saveUser(UserDTO userDTO);
    UserDTO getSelectedUser(String user_Id);
    void updateUser(UserDTO userDTO);
    void deleteUser(String user_Id);

}
