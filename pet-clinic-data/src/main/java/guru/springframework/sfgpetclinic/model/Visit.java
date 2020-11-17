package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;
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
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    private Pet pet;
}
