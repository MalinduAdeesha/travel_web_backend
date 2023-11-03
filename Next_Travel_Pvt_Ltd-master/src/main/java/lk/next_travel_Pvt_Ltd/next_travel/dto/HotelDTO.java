package lk.next_travel_Pvt_Ltd.next_travel.dto;

import jakarta.persistence.*;
import lk.next_travel_Pvt_Ltd.next_travel.util.enums.CancellationCriteria;
import lk.next_travel_Pvt_Ltd.next_travel.util.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class HotelDTO {

    private String hotel_Id;
    private String hotel_Name;
    private int category;
    private String location;
    private String location_with_coordinates;
    private String contact_email;
    private String contact_number_01;
    private String contact_number_02;
    private YesNo pets_allow_or_not;
    private double hotel_fee;
    private CancellationCriteria cancellation_criteria;
    private String hotel_remarks;

    public HotelDTO(String hotel_Name, int category, String location, String location_with_coordinates, String contact_email, String contact_number_01, String contact_number_02, YesNo pets_allow_or_not, double hotel_fee, CancellationCriteria cancellation_criteria, String hotel_remarks) {
        this.hotel_Name = hotel_Name;
        this.category = category;
        this.location = location;
        this.location_with_coordinates = location_with_coordinates;
        this.contact_email = contact_email;
        this.contact_number_01 = contact_number_01;
        this.contact_number_02 = contact_number_02;
        this.pets_allow_or_not = pets_allow_or_not;
        this.hotel_fee = hotel_fee;
        this.cancellation_criteria = cancellation_criteria;
        this.hotel_remarks = hotel_remarks;
    }
}
