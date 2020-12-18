package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@With
@Builder
@Table(name = "types")
public class PetType extends BaseEntity {
    @Column(name = "name")
    private String name;
}
