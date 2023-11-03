package lk.next_travel_Pvt_Ltd.next_travel.entity;

import jakarta.persistence.*;
import lk.next_travel_Pvt_Ltd.next_travel.util.enums.CancellationCriteria;
import lk.next_travel_Pvt_Ltd.next_travel.util.enums.Gender;
import lk.next_travel_Pvt_Ltd.next_travel.util.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Hotel implements SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String hotel_Id;

    @Column(nullable = false)
    private String hotel_Name;

    @Column(nullable = false)
    private int category;

    @Column(columnDefinition = "TEXT")
    private String location;

    @Column(columnDefinition = "TEXT")
    private String location_with_coordinates;

    @Column(nullable = false)
    private String contact_email;

    @Column(nullable = false)
    private String contact_number_01;

    @Column(nullable = false)
    private String contact_number_02;

    @Enumerated(EnumType.STRING)
    private YesNo pets_allow_or_not;

    @Column(nullable = false)
    private double hotel_fee;

    @Enumerated(EnumType.STRING)
    private CancellationCriteria cancellation_criteria;

    @Column(columnDefinition = "TEXT")
    private String hotel_remarks;

}
