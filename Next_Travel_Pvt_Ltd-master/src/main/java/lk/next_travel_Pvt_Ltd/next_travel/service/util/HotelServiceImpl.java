package lk.next_travel_Pvt_Ltd.next_travel.service.util;

import lk.next_travel_Pvt_Ltd.next_travel.dto.HotelDTO;
import lk.next_travel_Pvt_Ltd.next_travel.persistance.HotelDAO;
import lk.next_travel_Pvt_Ltd.next_travel.service.HotelService;
import lk.next_travel_Pvt_Ltd.next_travel.util.DataTypeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {

    @Autowired
    private DataTypeConversion conversion;

    @Autowired
    private HotelDAO dao;

    @Override
    public void saveHotel(HotelDTO hotelDTO) {

    }

    @Override
    public HotelDTO getSelectedHotel(String hotel_Id) {
        return null;
    }

    @Override
    public void updateHotel(HotelDTO hotelDTO) {

    }

    @Override
    public void deleteHotel(String hotel_Id) {

    }
}
