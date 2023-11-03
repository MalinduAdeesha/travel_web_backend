package lk.next_travel_Pvt_Ltd.next_travel.entity;


import jakarta.persistence.*;
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
@Entity
public class Package implements SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String package_id;

    @Enumerated(EnumType.STRING)
    private PackageCategory package_category;

    @Column(columnDefinition = "TEXT")
    private String travel_duration;

    @Column(nullable = false)
    private String travel_area;

    @Column(nullable = false)
    private String no_of_adults_and_children;

    @Column(nullable = false)
    private int total_Head_Count;

    @Enumerated(EnumType.STRING)
    private YesNo with_pets_or_no;

    @Enumerated(EnumType.STRING)
    private YesNo need_guide_or_no;

    @Column(nullable = false)
    private double package_Value;

    @Column(nullable = false)
    private double paid_Value;

    @Column(columnDefinition = "TEXT")
    private String package_remarks;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private User user_id;


}
