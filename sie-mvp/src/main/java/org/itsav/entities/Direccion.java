package org.itsav.entities;


import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "tbl_direcciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Direccion extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_direccion")
    private UUID idDireccion;

    @Column(name = "calle", nullable = false, length = 50)
    private String calle;

    @Column(name = "numero_ext", nullable = false, length = 10)
    private String numeroExt;

    @Column(name = "numero_int", length = 10)
    private String numeroInt;

    @Column(name = "colonia", nullable = false, length = 50)
    private String colonia;

    @Column(name = "cp", nullable = false, length = 5)
    private String cp;

    @Column(name = "ciudad", nullable = false)
    private Long ciudad;

    @Column(name = "fecha_creacion", nullable = false)
    private OffsetDateTime fechaCreacion;

    @Column(name = "fecha_actualizacion", nullable = false)
    private OffsetDateTime fechaActualizacion;
}
