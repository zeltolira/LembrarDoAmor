package br.com.lembrete.conjugelembrete.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.lembrete.conjugelembrete.application.api.request.ConjugeRequest;
import br.com.lembrete.conjugelembrete.application.api.response.ConjugeDetalhadoResponse;
import br.com.lembrete.conjugelembrete.application.api.response.ConjugeListResponse;
import br.com.lembrete.conjugelembrete.application.api.response.ConjugeResponse;
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

	@Override
	public ConjugeDetalhadoResponse getTodosConjugesAtravesId(UUID idConjuge) {
		log.info("[inicia] ConjugeController - getTodosConjugesAtravesId");
		ConjugeDetalhadoResponse conjugeDetalhado = conjugeService.buscaConjugeAtravesId();
		log.info("[finaliza] ConjugeController - getTodosConjugesAtravesId");
		return conjugeDetalhado;
	}
}
