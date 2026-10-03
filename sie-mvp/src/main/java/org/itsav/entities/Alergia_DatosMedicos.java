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
public class Alergia_DatosMedicos implements Serializable {

    @Column(name = "alergia")
    private Integer alergia;

    @Column(name = "dato_medico")
    private UUID datoMedico;
}
