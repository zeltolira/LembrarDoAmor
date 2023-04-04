package br.com.lembrete.conjugelembrete.application.api.request;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.lembrete.conjugelembrete.domain.Sexo;
import lombok.Value;

@Value
public class ConjugeRequest {

	@NotBlank
	private String nomeConjuge;
	@NotNull
	private Sexo sexo;
	@NotBlank
	private String celular;
	@NotNull
	private LocalDate dataNascimento;
}
