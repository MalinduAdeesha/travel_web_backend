package lk.next_travel_Pvt_Ltd.next_travel.dto;

import lk.next_travel_Pvt_Ltd.next_travel.util.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserDTO {

    private String user_Id;
    private String user_Name;
    private String user_nic_number;
    private String user_nic_image;
    private int user_age;
    private Gender user_gender;
    private String user_contact_email;
    private String user_contact_number;
    private String user_address;
    private String user_remarks;

    public UserDTO(String user_Name, String user_nic_number, String user_nic_image, int user_age, Gender user_gender, String user_contact_email, String user_contact_number, String user_address, String user_remarks) {
        this.user_Name = user_Name;
        this.user_nic_number = user_nic_number;
        this.user_nic_image = user_nic_image;
        this.user_age = user_age;
        this.user_gender = user_gender;
        this.user_contact_email = user_contact_email;
        this.user_contact_number = user_contact_number;
        this.user_address = user_address;
        this.user_remarks = user_remarks;
    }
}
