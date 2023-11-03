package lk.next_travel_Pvt_Ltd.next_travel.dto;

import lk.next_travel_Pvt_Ltd.next_travel.entity.User;
import lk.next_travel_Pvt_Ltd.next_travel.util.enums.PackageCategory;
import lk.next_travel_Pvt_Ltd.next_travel.util.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PackageDTO {

    private String package_id;
    private PackageCategory package_category;
    private String travel_duration;
    private String travel_area;
    private String no_of_adults_and_children;
    private int total_Head_Count;
    private YesNo with_pets_or_no;
    private YesNo need_guide_or_no;
    private double package_Value;
    private double paid_Value;
    private String package_remarks;
    private User user_id;

    public PackageDTO(PackageCategory package_category, String travel_duration, String travel_area, String no_of_adults_and_children, int total_Head_Count, YesNo with_pets_or_no, YesNo need_guide_or_no, double package_Value, double paid_Value, String package_remarks, User user_id) {
        this.package_category = package_category;
        this.travel_duration = travel_duration;
        this.travel_area = travel_area;
        this.no_of_adults_and_children = no_of_adults_and_children;
        this.total_Head_Count = total_Head_Count;
        this.with_pets_or_no = with_pets_or_no;
        this.need_guide_or_no = need_guide_or_no;
        this.package_Value = package_Value;
        this.paid_Value = paid_Value;
        this.package_remarks = package_remarks;
        this.user_id = user_id;
    }
}
