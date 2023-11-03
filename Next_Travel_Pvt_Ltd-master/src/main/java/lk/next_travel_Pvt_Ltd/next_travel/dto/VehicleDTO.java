package lk.next_travel_Pvt_Ltd.next_travel.dto;

import lk.next_travel_Pvt_Ltd.next_travel.util.enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class VehicleDTO {

    private String vehicle_Id;
    private String vehicle_brand;
    private VehicleCategory category;
    private FuelType fuel_type;
    private YesNo hybrid_Or_Non_Hybrid;
    private String fuel_Usage;
    private String image_Of_Vehicle;
    private int seat_Capacity;
    private VehicleType vehicle_Type;
    private TransmissionType transmission_Type;
    private String driver_Name;
    private String driver_Contact_Number;
    private String driver_License_Image;
    private String vehicle_remarks;

    public VehicleDTO(String vehicle_brand, VehicleCategory category, FuelType fuel_type, YesNo hybrid_Or_Non_Hybrid, String fuel_Usage, String image_Of_Vehicle, int seat_Capacity, VehicleType vehicle_Type, TransmissionType transmission_Type, String driver_Name, String driver_Contact_Number, String driver_License_Image, String vehicle_remarks) {
        this.vehicle_brand = vehicle_brand;
        this.category = category;
        this.fuel_type = fuel_type;
        this.hybrid_Or_Non_Hybrid = hybrid_Or_Non_Hybrid;
        this.fuel_Usage = fuel_Usage;
        this.image_Of_Vehicle = image_Of_Vehicle;
        this.seat_Capacity = seat_Capacity;
        this.vehicle_Type = vehicle_Type;
        this.transmission_Type = transmission_Type;
        this.driver_Name = driver_Name;
        this.driver_Contact_Number = driver_Contact_Number;
        this.driver_License_Image = driver_License_Image;
        this.vehicle_remarks = vehicle_remarks;
    }
}
