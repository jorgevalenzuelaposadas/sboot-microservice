package com.jvp.poc.sgc.core.facade;

import java.math.BigDecimal;

import com.jvp.poc.model.BaseOperacionResponse;
import com.jvp.poc.model.CollectionResponse;
import com.jvp.poc.model.core.PersonaFiltroRequest;
import com.jvp.poc.model.core.PersonaRequest;
import com.jvp.poc.model.core.PersonaResponse;

public interface PersonaFacade {
	PersonaResponse initForm();

	CollectionResponse<PersonaResponse> find(PersonaFiltroRequest request);

	BaseOperacionResponse saveOrUpdate(PersonaRequest request);

	BaseOperacionResponse delete(BigDecimal idPersona);

	PersonaResponse get(BigDecimal personaId);
	
	CollectionResponse<PersonaResponse> findByKeywordIgnoreCase(String keyword);
}
