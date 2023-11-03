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
public class Admin implements SuperEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String admin_Id;

    @Column(nullable = false)
    private String admin_Name;

    @Column(nullable = false)
    private String admin_email;

    @Column(nullable = false)
    private String admin_password;

    @Column(nullable = false)
    private String admin_address;

    @Enumerated(EnumType.STRING)
    private Roles admin_role;

}
