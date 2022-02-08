package diningReview.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Restaurant {

    @Id @GeneratedValue @Getter @Setter
    private Long id;
    @Getter @Setter
    private Integer userScore;
    @Getter @Setter
    private Integer overallRestaurantScore;
    @Getter @Setter
    private Integer peanutScore;
    @Getter @Setter
    private Integer eggScore;
    @Getter @Setter
    private Integer dairyScore;


}
