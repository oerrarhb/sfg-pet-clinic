package guru.springframework.sfgpetclinic.services.map;

import static org.junit.jupiter.api.Assertions.assertEquals;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    Long ownerId = 1L;
    String lastName = "Parker";


    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(), new PetServiceMap());
        ownerServiceMap.save(new Owner());
        Owner owner = new Owner();
        owner.setLastName(lastName);
        ownerServiceMap.save(owner);
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ownerId);
        System.out.println(ownerServiceMap.findAll().size());
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void findAll() {
        assertEquals(2, ownerServiceMap.findAll().size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(1, ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(1, ownerServiceMap.findAll().size());
    }

    @Test
    void save() {
        Owner owner2 = new Owner();
        Owner savedOwner = ownerServiceMap.save(owner2);
        assertEquals(3L, savedOwner.getId());
    }

    @Test
    void findByLastName() {
        Owner owner = ownerServiceMap.findByLastName(lastName);
        assertEquals(lastName, owner.getLastName());
    }
}