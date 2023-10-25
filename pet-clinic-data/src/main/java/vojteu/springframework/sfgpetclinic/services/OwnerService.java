package vojteu.springframework.sfgpetclinic.services;

import vojteu.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
