package com.saul.Examen.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@Entity
public class Empleado implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1469285467119600917L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    @NotNull
    private Integer id_empleado;
    @Column(name = "apellido")
    @Size(min = 3, max = 45, message="El apellido debe tener entre 3 y 45 caracteres")
    private String apellido;

    @Column(name = "nombre")
    @NotBlank(message="“400 Bad Request")
    @Size(min = 3, max = 45, message="El nombre debe tener entre 3 y 45 caracteres")
    private String nombre;

    @Column(name = "telefono")
    @NotBlank(message="“400 Bad Request")
    @Size(min = 10, max = 15, message="El telefono debe tener entre 10 y 15 caracteres")
    private String telefono;

    @Column(name = "direccion")
    @NotBlank(message="“400 Bad Request")
    @Size(min = 3, max = 45, message="La direccion debe tener entre 3 y 45 caracteres")
    private String direccion;

    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;

    @Column(name = "observacion")
    @NotBlank(message="“400 Bad Request")
    @Size(min = 3, max = 45, message="La observacion tiene que tener entre 3 y 45 caracteres")
    private String observacion;

    @Column(name = "dias_trabajo")
    private Integer dias_trabajo;

    @Column(name = "sueldo")
    @Min(value = 1, message="No se permiten valores menores de 1")
    private String sueldo;

}
