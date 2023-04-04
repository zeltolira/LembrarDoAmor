package br.com.lembrete.conjugelembrete.application.api.response;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.lembrete.conjugelembrete.domain.Sexo;
import lombok.Value;

@Value
public class ConjugeDetalhadoResponse {

	private UUID idConjuge;
	private String nomeConjuge;
	private Sexo sexo;
	private String celular;
	private LocalDate dataNascimento;
	private LocalDateTime dataHoraUltimaAlteracao;
}
