package org.itsav.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ctl_Paises")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paises extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Pais")
    private Long idPais;

    @Column(name = "Nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "prefijo", nullable = false, length = 5)
    private String prefijo;
}
