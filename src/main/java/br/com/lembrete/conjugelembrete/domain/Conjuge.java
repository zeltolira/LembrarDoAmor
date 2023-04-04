package br.com.lembrete.conjugelembrete.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.lembrete.conjugelembrete.application.api.request.ConjugeRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "conjuge")
public class Conjuge {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idConjuge;
	@NotBlank
	private String nomeConjuge;
	@NotNull
	private Sexo sexo;
	@NotBlank
	private String celular;
	@NotNull
	private LocalDate dataNascimento;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraUltimaAlteracao;

	public Conjuge(ConjugeRequest conjugeRequest) {
		this.nomeConjuge = conjugeRequest.getNomeConjuge();
		this.sexo = conjugeRequest.getSexo();
		this.celular = conjugeRequest.getCelular();
		this.dataNascimento = conjugeRequest.getDataNascimento();
		this.dataHoraDoCadastro = LocalDateTime.now();
		}
}
