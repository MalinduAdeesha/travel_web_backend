package lk.next_travel_Pvt_Ltd.next_travel.service.util;

import lk.next_travel_Pvt_Ltd.next_travel.dto.VehicleDTO;
import lk.next_travel_Pvt_Ltd.next_travel.persistance.VehicleDAO;
import lk.next_travel_Pvt_Ltd.next_travel.service.VehicleService;
import lk.next_travel_Pvt_Ltd.next_travel.util.DataTypeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private DataTypeConversion conversion;

    @Autowired
    private VehicleDAO dao;

    @Override
    public void saveVehicle(VehicleDTO vehicleDTO) {

    }

    @Override
    public VehicleDTO getSelectedVehicle(String vehicle_Id) {
        return null;
    }

    @Override
    public void updateVehicle(VehicleDTO vehicleDTO) {

    }

    @Override
    public void deleteVehicle(String vehicle_Id) {

    }
}
