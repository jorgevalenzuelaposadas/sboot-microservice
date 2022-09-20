package com.jvp.poc.sgc.core.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jvp.poc.domain.core.Persona;

//@Repository
public interface PersonaRepository extends JpaRepository<Persona, BigDecimal>, JpaSpecificationExecutor<Persona> {
//@Query(value = "select c from Persona c where "+ "UPPER(c.nombre) LIKE %?1% or UPPER(c.apellido) LIKE %?1%")
@Query(value = "select c from Persona c where "+ "lower(c.nombre) like lower(concat('%',?1,'%')) or lower(c.apellido) like lower(concat('%',?1,'%'))")

List<Persona> findByKeywordIgnoreCase (String keyword);
}
