package br.com.lembrete.conjugelembrete.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ConjugeController implements ConjugeAPI {

	@Override
	public ConjugeResponse postConjuge(@Valid ConjugeRequest conjugeRequest) {
		log.info("[inicia] ConjugeController - postConjuge");
		log.info("[finaliza] ConjugeController - postConjuge");
		return null;
	}

}
