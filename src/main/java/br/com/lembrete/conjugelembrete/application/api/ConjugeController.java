package br.com.lembrete.conjugelembrete.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.lembrete.conjugelembrete.application.service.ConjugeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ConjugeController implements ConjugeAPI {
	private final ConjugeService conjugeService;

	@Override
	public ConjugeResponse postConjuge(ConjugeRequest conjugeRequest) {
		log.info("[inicia] ConjugeController - postConjuge");
		ConjugeResponse conjugeCriado = conjugeService.criaConjuge(conjugeRequest);
		log.info("[finaliza] AdolescenteController - postAdolescente");
		return conjugeCriado;
	}

	@Override
	public List<ConjugeListResponse> getTodosConjuges() {
		log.info("[inicia] ConjugeController - getTodosConjuges");
		List<ConjugeListResponse> conjuges = conjugeService.buscaTodosConjuges();
		log.info("[finaliza] ConjugeController - getTodosConjuges");
		return conjuges;
	}
}
