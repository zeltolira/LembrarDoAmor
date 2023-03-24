package br.com.lembrete.conjugelembrete.application.service;

import br.com.lembrete.conjugelembrete.application.api.ConjugeRequest;
import br.com.lembrete.conjugelembrete.application.api.ConjugeResponse;

public interface ConjugeService {
	ConjugeResponse criaConjuge(ConjugeRequest conjugeRequest);
}
