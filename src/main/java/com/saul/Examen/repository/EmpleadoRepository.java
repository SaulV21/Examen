package com.saul.Examen.repository;

import com.saul.Examen.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

    @Query(value = "Select * from empleado c where c.id_empleado= :id_empleado", nativeQuery = true)
    public Empleado buscarEmpleado(Integer id);
}
