package lk.next_travel_Pvt_Ltd.next_travel.dto;

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
public class GuideDTO {

    private String guide_Id;
    private String guide_Name;
    private String guide_address;
    private int guide_age;
    private Gender guide_gender;
    private String guide_contact_number;
    private String guide_image;
    private String guide_nic_image;
    private String guide_id_image;
    private String experience;
    private int man_day_value;
    private String guide_remarks;

    public GuideDTO(String guide_Name, String guide_address, int guide_age, Gender guide_gender, String guide_contact_number, String guide_image, String guide_nic_image, String guide_id_image, String experience, int man_day_value, String guide_remarks) {
        this.guide_Name = guide_Name;
        this.guide_address = guide_address;
        this.guide_age = guide_age;
        this.guide_gender = guide_gender;
        this.guide_contact_number = guide_contact_number;
        this.guide_image = guide_image;
        this.guide_nic_image = guide_nic_image;
        this.guide_id_image = guide_id_image;
        this.experience = experience;
        this.man_day_value = man_day_value;
        this.guide_remarks = guide_remarks;
    }
}
