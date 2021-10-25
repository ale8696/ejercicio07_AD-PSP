package salesianos.dam.ejercicio07.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class AddedToPK {

    private Long song_id;

    private Long playlist_id;

}