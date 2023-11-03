package lk.next_travel_Pvt_Ltd.next_travel.service;

import lk.next_travel_Pvt_Ltd.next_travel.dto.HotelDTO;

public interface HotelService {

    void saveHotel(HotelDTO hotelDTO);
    HotelDTO getSelectedHotel(String hotel_Id);
    void updateHotel(HotelDTO hotelDTO);
    void deleteHotel(String hotel_Id);

}
