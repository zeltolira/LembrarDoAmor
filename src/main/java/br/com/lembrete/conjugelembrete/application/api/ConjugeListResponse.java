package br.com.lembrete.conjugelembrete.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import br.com.lembrete.conjugelembrete.domain.Sexo;

public class ConjugeListResponse {

	private UUID idConjuge;
	private String nomeConjuge;
	private Sexo sexo;
	private String celular;
	private LocalDate dataNascimento;

	public static List<ConjugeListResponse> converte(List<ConjugeListResponse> conjuges) {
		// TODO Auto-generated method stub
		return null;
	}
}
