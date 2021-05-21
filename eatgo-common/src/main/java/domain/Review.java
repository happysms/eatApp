package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Review {

    @GeneratedValue
    @Id
    private Long id;

    @NotEmpty
    private String name;

    @NotNull
    private Integer score;

    @NotEmpty
    private String description;

    private Long restaurantId;

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
}
