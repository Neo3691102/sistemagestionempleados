package com.sistemaempleados.demo.Repositorios;

import com.sistemaempleados.demo.Entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
