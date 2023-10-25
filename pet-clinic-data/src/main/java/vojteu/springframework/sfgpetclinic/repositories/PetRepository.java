package vojteu.springframework.sfgpetclinic.repositories;

import vojteu.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
