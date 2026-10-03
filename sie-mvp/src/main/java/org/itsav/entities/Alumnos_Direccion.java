package org.itsav.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumnos_Direccion implements Serializable {

    @Column(name = "direccion")
    private UUID direccion;

    @Column(name = "alumno")
    private UUID alumno;
}
