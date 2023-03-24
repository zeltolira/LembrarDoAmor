package br.com.lembrete.conjugelembrete.application.service;

import javax.validation.Valid;

import br.com.lembrete.conjugelembrete.application.api.ConjugeRequest;
import br.com.lembrete.conjugelembrete.application.api.ConjugeResponse;

public interface ConjugeService {

	static ConjugeResponse criaConjuge(@Valid ConjugeRequest conjugeRequest) {
		return null;
	}

}
