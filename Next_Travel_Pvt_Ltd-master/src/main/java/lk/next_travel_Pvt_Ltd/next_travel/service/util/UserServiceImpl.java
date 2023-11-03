package lk.next_travel_Pvt_Ltd.next_travel.service.util;

import lk.next_travel_Pvt_Ltd.next_travel.dto.UserDTO;
import lk.next_travel_Pvt_Ltd.next_travel.persistance.UserDAO;
import lk.next_travel_Pvt_Ltd.next_travel.service.UserService;
import lk.next_travel_Pvt_Ltd.next_travel.util.DataTypeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private DataTypeConversion conversion;

    @Autowired
    private UserDAO dao;

    @Override
    public void saveUser(UserDTO userDTO) {

    }

    @Override
    public UserDTO getSelectedUser(String user_Id) {
        return null;
    }

    @Override
    public void updateUser(UserDTO userDTO) {

    }

    @Override
    public void deleteUser(String user_Id) {

    }
}
