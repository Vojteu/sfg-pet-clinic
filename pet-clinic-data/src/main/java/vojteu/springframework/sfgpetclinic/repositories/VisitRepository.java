package vojteu.springframework.sfgpetclinic.repositories;

import vojteu.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
