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
public class Guide implements SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String guide_Id;

    @Column(nullable = false)
    private String guide_Name;

    @Column(nullable = false)
    private String guide_address;

    @Column(nullable = false)
    private int guide_age;

    @Enumerated(EnumType.STRING)
    private Gender guide_gender;

    @Column(nullable = false)
    private String guide_contact_number;

    @Column(columnDefinition = "TEXT")
    private String guide_image;

    @Column(columnDefinition = "TEXT")
    private String guide_nic_image;

    @Column(columnDefinition = "TEXT")
    private String guide_id_image;

    @Column(columnDefinition = "TEXT")
    private String experience;

    @Column(nullable = false)
    private int man_day_value;

    @Column(columnDefinition = "TEXT")
    private String guide_remarks;


}
