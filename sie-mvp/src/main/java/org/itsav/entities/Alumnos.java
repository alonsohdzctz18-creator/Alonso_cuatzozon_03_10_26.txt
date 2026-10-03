package org.itsav.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "tbl_alumnos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumnos extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_alumno")
    private UUID idAlumno;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "apellido_paterno", nullable = false, length = 100)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", length = 100)
    private String apellidoMaterno;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "curp", nullable = false, length = 18)
    private String curp;

    @Column(name = "num_telefono_fijo", length = 10)
    private String numTelefonoFijo;

    @Column(name = "num_telefono_movil", nullable = false, length = 10)
    private String numTelefonoMovil;

    @Column(name = "correo_personal", length = 100)
    private String correoPersonal;

    @Column(name = "correo_institucional", length = 100)
    private String correoInstitucional;

    @Column(name = "nombre_tutor", nullable = false, length = 100)
    private String nombreTutor;

    @Column(name = "contacto_tutor", nullable = false, length = 10)
    private String contactoTutor;

    @Column(name = "num_control", length = 9)
    private String numControl;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @Column(name = "fecha_creacion", nullable = false)
    private OffsetDateTime fechaCreacion;

    @Column(name = "fecha_actualizacion", nullable = false)
    private OffsetDateTime fechaActualizacion;
}
