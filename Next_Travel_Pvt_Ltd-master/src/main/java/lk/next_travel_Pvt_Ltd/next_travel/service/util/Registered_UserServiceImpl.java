package lk.next_travel_Pvt_Ltd.next_travel.service.util;

import lk.next_travel_Pvt_Ltd.next_travel.dto.Registered_UserDTO;
import lk.next_travel_Pvt_Ltd.next_travel.persistance.Registered_UserDAO;
import lk.next_travel_Pvt_Ltd.next_travel.service.Registered_UserService;
import lk.next_travel_Pvt_Ltd.next_travel.util.DataTypeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Registered_UserServiceImpl implements Registered_UserService {

    @Autowired
    private DataTypeConversion conversion;

    @Autowired
    private Registered_UserDAO dao;

    @Override
    public void saveRegisteredUser(Registered_UserDTO registered_userDTO) {

    }

    @Override
    public Registered_UserDTO getSelectedRegisteredUser(String user_Id) {
        return null;
    }

    @Override
    public void updateRegisteredUser(Registered_UserDTO registered_userDTO) {

    }

    @Override
    public void deleteRegisteredUser(String user_Id) {

    }
}
