package org.itsav.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "tbl_datos_medicos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Datos_Medicos extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_dato_medico")
    private UUID idDatoMedico;

    @Column(name = "tipo_sangre", length = 3)
    private String tipoSangre;

    @Column(name = "alumno", nullable = false)
    private UUID alumno;

    @Column(name = "fecha_creacion", nullable = false)
    private OffsetDateTime fechaCreacion;

    @Column(name = "fecha_actualizacion", nullable = false)
    private OffsetDateTime fechaActualizacion;
}