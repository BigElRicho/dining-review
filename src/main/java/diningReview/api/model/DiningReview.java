package diningReview.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Optional;

@Entity
@NoArgsConstructor
public class DiningReview {

    @Id @GeneratedValue @Getter @Setter
    private Long id;
    @Getter @Setter
    private String user;
    @Getter @Setter
    private Long restaurantId;
    @Getter @Setter
    private Optional<Integer> peanutScore;
    @Getter @Setter
    private Optional<Integer> eggScore;
    @Getter @Setter
    private Optional<Integer> dairyScore;
    @Getter @Setter
    private Optional<Integer> commentary;

}
