package salesianos.dam.ejercicio07.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class Artist implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
