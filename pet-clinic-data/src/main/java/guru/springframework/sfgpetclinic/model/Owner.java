package guru.springframework.sfgpetclinic.model;

import java.util.Set;
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
public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;
}
