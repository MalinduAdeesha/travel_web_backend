package lk.next_travel_Pvt_Ltd.next_travel.service;

import lk.next_travel_Pvt_Ltd.next_travel.dto.UserDTO;
import lk.next_travel_Pvt_Ltd.next_travel.dto.VehicleDTO;

public interface VehicleService {

    void saveVehicle(VehicleDTO vehicleDTO);
    VehicleDTO getSelectedVehicle(String vehicle_Id);
    void updateVehicle(VehicleDTO vehicleDTO);
    void deleteVehicle(String vehicle_Id);

}
