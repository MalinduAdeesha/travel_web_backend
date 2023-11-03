package lk.next_travel_Pvt_Ltd.next_travel.service.util;

import lk.next_travel_Pvt_Ltd.next_travel.dto.AdminDTO;
import lk.next_travel_Pvt_Ltd.next_travel.persistance.AdminDAO;
import lk.next_travel_Pvt_Ltd.next_travel.service.AdminService;
import lk.next_travel_Pvt_Ltd.next_travel.util.DataTypeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private DataTypeConversion conversion;

    @Autowired
    private AdminDAO dao;

    @Override
    public void saveAdmin(AdminDTO adminDTO) {

    }

    @Override
    public AdminDTO getSelectedAdmin(String admin_Id) {
        return null;
    }

    @Override
    public void updateAdmin(AdminDTO adminDTO) {

    }

    @Override
    public void deleteAdmin(String admin_Id) {

    }
}
