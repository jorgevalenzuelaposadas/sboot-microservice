package com.jvp.poc.sgc.core.service;

import java.math.BigDecimal;
import java.util.List;

import com.jvp.poc.domain.core.Persona;
import com.jvp.poc.model.core.PersonaFiltroRequest;

public interface PersonaService {

	List<Persona> find(PersonaFiltroRequest request);
	
	Persona get(BigDecimal personaId);

	void delete(Persona personaId);

	void saveOrUpdate(Persona personaRequest);
	
	List<Persona> findByKeywordIgnoreCase(String keyword);

}
