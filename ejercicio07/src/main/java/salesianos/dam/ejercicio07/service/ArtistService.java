package salesianos.dam.ejercicio07.service;

import org.springframework.stereotype.Service;
import salesianos.dam.ejercicio07.model.Artist;
import salesianos.dam.ejercicio07.repository.ArtistRepository;
import salesianos.dam.ejercicio07.service.base.BaseService;

@Service
public class ArtistService extends BaseService<Artist, Long, ArtistRepository> {
}
