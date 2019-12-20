package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private petType petType;
    private Owner owner;
    private LocalDate birthDate;

    public guru.springframework.sfgpetclinic.model.petType getPetType() {
        return petType;
    }

    public void setPetType(guru.springframework.sfgpetclinic.model.petType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getLocalDate() {
        return birthDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.birthDate = localDate;
    }
}
