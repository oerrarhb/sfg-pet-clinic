package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@With
public class PetType extends BaseEntity {
    private String name;
}
