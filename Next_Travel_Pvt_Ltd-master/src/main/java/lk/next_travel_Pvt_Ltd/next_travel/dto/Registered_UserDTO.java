package lk.next_travel_Pvt_Ltd.next_travel.dto;

import lk.next_travel_Pvt_Ltd.next_travel.util.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Registered_UserDTO {

    private String user_Id;
    private String user_Name;
    private String user_email;
    private String user_password;
    private String user_nic_number;
    private String user_address;
    private String user_profile_picture;
    private Roles user_role;

    public Registered_UserDTO(String user_Name, String user_email, String user_password, String user_nic_number, String user_address, String user_profile_picture, Roles user_role) {
        this.user_Name = user_Name;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_nic_number = user_nic_number;
        this.user_address = user_address;
        this.user_profile_picture = user_profile_picture;
        this.user_role = user_role;
    }
}
