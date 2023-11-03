package lk.next_travel_Pvt_Ltd.next_travel.service;

import lk.next_travel_Pvt_Ltd.next_travel.dto.HotelDTO;
import lk.next_travel_Pvt_Ltd.next_travel.dto.PackageDTO;

public interface PackageService {

    void savePackage(PackageDTO packageDTO);
    PackageDTO getSelectedPackage(String package_id);
    void updatePackage(PackageDTO packageDTO);
    void deletePackage(String package_id);

}
