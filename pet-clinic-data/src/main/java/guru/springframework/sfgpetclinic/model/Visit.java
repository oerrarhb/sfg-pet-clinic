package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    private Pet pet;
}