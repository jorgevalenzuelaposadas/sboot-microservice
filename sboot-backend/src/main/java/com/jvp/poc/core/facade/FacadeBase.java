package com.jvp.poc.core.facade;

import org.springframework.stereotype.Service;

import com.jvp.poc.core.ErrorResponse;
import com.jvp.poc.core.exception.BusinessException;
import com.jvp.poc.core.logger.CoreLogger;

@Service("facadeBase")
public class FacadeBase {

	protected void launchException(CoreLogger logger, Exception e) throws BusinessException {
		if (e instanceof BusinessException) {
			throw (BusinessException) e;
		} else {
			logger.error("[ERROR] :" + e.getMessage(), e);
			ErrorResponse ErrorResponse = new ErrorResponse();
			ErrorResponse.setMensaje("FACADE:Ocurrio un error, vuelva a intertarlo o contacte con su Administrador");
			ErrorResponse.setMensajeTecnico(e.getMessage());
			ErrorResponse.setTrace(e);
			throw new BusinessException(ErrorResponse);
		}
	}
}
