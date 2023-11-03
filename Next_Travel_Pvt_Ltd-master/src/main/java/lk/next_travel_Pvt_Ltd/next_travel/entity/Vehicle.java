package lk.next_travel_Pvt_Ltd.next_travel.entity;

import jakarta.persistence.*;
import lk.next_travel_Pvt_Ltd.next_travel.util.enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Vehicle implements SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String vehicle_Id;

    @Column(nullable = false)
    private String vehicle_brand;

    @Enumerated(EnumType.STRING)
    private VehicleCategory category;

    @Enumerated(EnumType.STRING)
    private FuelType fuel_type;

    @Enumerated(EnumType.STRING)
    private YesNo hybrid_Or_Non_Hybrid;

    @Column(nullable = false)
    private String fuel_Usage;

    @Column(columnDefinition = "TEXT")
    private String image_Of_Vehicle;

    @Column(nullable = false)
    private int seat_Capacity;

    @Enumerated(EnumType.STRING)
    private VehicleType vehicle_Type;

    @Enumerated(EnumType.STRING)
    private TransmissionType transmission_Type;

    @Column(nullable = false)
    private String driver_Name;

    @Column(nullable = false)
    private String driver_Contact_Number;

    @Column(columnDefinition = "TEXT")
    private String driver_License_Image;

    @Column(columnDefinition = "TEXT")
    private String vehicle_remarks;

}
