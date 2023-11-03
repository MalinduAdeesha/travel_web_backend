package lk.next_travel_Pvt_Ltd.next_travel.entity;

import jakarta.persistence.*;
import lk.next_travel_Pvt_Ltd.next_travel.util.enums.Gender;
import lk.next_travel_Pvt_Ltd.next_travel.util.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Registered_User implements SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String user_Id;

    @Column(nullable = false)
    private String user_Name;

    @Column(nullable = false)
    private String user_email;

    @Column(nullable = false)
    private String user_password;

    @Column(nullable = false)
    private String user_nic_number;

    @Column(nullable = false)
    private String user_address;

    @Column(columnDefinition = "TEXT")
    private String user_profile_picture;

    @Enumerated(EnumType.STRING)
    private Roles user_role;

}
