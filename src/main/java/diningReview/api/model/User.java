package diningReview.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class User {

    @Id @GeneratedValue @Getter @Setter
    private Long id;
    @Column(unique = true) @Getter @Setter
    private String displayName;
    @Getter @Setter
    private String city;
    @Getter @Setter
    private String state;
    @Getter @Setter
    private String zipcode;
    @Getter @Setter
    private Boolean isInterestedInPeanutAllergy;
    @Getter @Setter
    private Boolean isInterestedInEggAllergy;
    @Getter @Setter
    private Boolean getIsInterestedInDairyAllergy;







}
