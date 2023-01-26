package com.saul.Examen.service;

import com.saul.Examen.model.Empleado;
import com.saul.Examen.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends GenericServiceImpl<Empleado, Integer> implements EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public CrudRepository<Empleado, Integer> getDao() {
        return empleadoRepository;
    }

    public Empleado buscarCliente(Integer id) {
        return empleadoRepository.buscarEmpleado(id);
    }

}
