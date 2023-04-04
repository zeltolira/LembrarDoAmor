package br.com.lembrete.conjugelembrete.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.lembrete.conjugelembrete.application.api.request.ConjugeRequest;
import br.com.lembrete.conjugelembrete.application.api.response.ConjugeDetalhadoResponse;
import br.com.lembrete.conjugelembrete.application.api.response.ConjugeListResponse;
import br.com.lembrete.conjugelembrete.application.api.response.ConjugeResponse;


@RestController
@RequestMapping("/v1/conjuge")
public interface ConjugeAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ConjugeResponse postConjuge(@Valid @RequestBody ConjugeRequest conjugeRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ConjugeListResponse> getTodosConjuges();

	@GetMapping(value = "/{idConjuge}")
	@ResponseStatus(code = HttpStatus.OK)
	ConjugeDetalhadoResponse getTodosConjugesAtravesId(@PathVariable UUID idConjuge);
}
