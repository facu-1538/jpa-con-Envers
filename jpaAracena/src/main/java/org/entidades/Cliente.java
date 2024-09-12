package org.entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Setter
@Getter
@Audited



@Entity
public class Cliente  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;

    private String apellido;

    //@Column(unique = true)
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "fk_domicilio")

    private Domicilio domicilio;

}
