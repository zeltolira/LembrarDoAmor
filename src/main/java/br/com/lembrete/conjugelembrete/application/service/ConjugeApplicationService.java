package br.com.lembrete.conjugelembrete.application.service;

import org.springframework.stereotype.Service;

import br.com.lembrete.conjugelembrete.application.api.ConjugeRequest;
import br.com.lembrete.conjugelembrete.application.api.ConjugeResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ConjugeApplicationService implements ConjugeService {

	@Override
	public ConjugeResponse criaConjuge(ConjugeRequest conjugeRequest) {
		log.info("[inicia] ConjugeApplicationService - criaConjuge");
		log.info("[finaliza] ConjugeApplicationService - criaConjuge");
		return null;
	}

}
