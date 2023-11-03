package lk.next_travel_Pvt_Ltd.next_travel.entity;

import jakarta.persistence.*;
import lk.next_travel_Pvt_Ltd.next_travel.util.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class User implements SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String user_Id;

    @Column(nullable = false)
    private String user_Name;

    @Column(nullable = false)
    private String user_nic_number;

    @Column(columnDefinition = "TEXT")
    private String user_nic_image;

    @Column(nullable = false)
    private int user_age;

    @Enumerated(EnumType.STRING)
    private Gender user_gender;

    @Column(nullable = false)
    private String user_contact_email;

    @Column(nullable = false)
    private String user_contact_number;

    @Column(nullable = false)
    private String user_address;

    @Column(columnDefinition = "TEXT")
    private String user_remarks;

}
