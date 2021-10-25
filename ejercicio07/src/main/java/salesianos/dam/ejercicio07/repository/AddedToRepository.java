package salesianos.dam.ejercicio07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salesianos.dam.ejercicio07.model.AddedTo;
import salesianos.dam.ejercicio07.model.AddedToPK;

public interface AddedToRepository extends JpaRepository<AddedTo, AddedToPK> {
}
