package salesianos.dam.ejercicio07.service;

import org.springframework.stereotype.Service;
import salesianos.dam.ejercicio07.model.AddedTo;
import salesianos.dam.ejercicio07.model.AddedToPK;
import salesianos.dam.ejercicio07.repository.AddedToRepository;
import salesianos.dam.ejercicio07.service.base.BaseService;

@Service
public class AddedToService extends BaseService<AddedTo, AddedToPK, AddedToRepository> {
}
