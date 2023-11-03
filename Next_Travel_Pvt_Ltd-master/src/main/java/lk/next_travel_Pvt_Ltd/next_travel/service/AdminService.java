package lk.next_travel_Pvt_Ltd.next_travel.service;

import lk.next_travel_Pvt_Ltd.next_travel.dto.AdminDTO;
import lk.next_travel_Pvt_Ltd.next_travel.dto.GuideDTO;

public interface AdminService {

    void saveAdmin(AdminDTO adminDTO);
    AdminDTO getSelectedAdmin(String admin_Id);
    void updateAdmin(AdminDTO adminDTO);
    void deleteAdmin(String admin_Id);

}
