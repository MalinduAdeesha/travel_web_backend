package lk.next_travel_Pvt_Ltd.next_travel.dto;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lk.next_travel_Pvt_Ltd.next_travel.util.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AdminDTO {

    private String admin_Id;
    private String admin_Name;
    private String admin_email;
    private String admin_password;
    private String admin_address;
    private Roles admin_role;

    public AdminDTO(String admin_Name, String admin_email, String admin_password, String admin_address, Roles admin_role) {
        this.admin_Name = admin_Name;
        this.admin_email = admin_email;
        this.admin_password = admin_password;
        this.admin_address = admin_address;
        this.admin_role = admin_role;
    }
}
