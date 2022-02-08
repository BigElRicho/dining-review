package diningReview.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity @NoArgsConstructor
public class AdminReview {

    @Getter @Setter @Id @GeneratedValue
    private Long id;
}
