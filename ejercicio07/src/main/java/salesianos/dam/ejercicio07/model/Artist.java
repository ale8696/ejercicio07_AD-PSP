package salesianos.dam.ejercicio07.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class Artist {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
