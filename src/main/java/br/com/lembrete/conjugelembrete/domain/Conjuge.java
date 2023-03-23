package br.com.lembrete.conjugelembrete.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "conjuge")
public class Conjuge {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idConjuge;
	@NotBlank
	private String nome;
	@NotNull
	private Sexo sexo;
	@NotBlank
	private String celular;
	@NotNull
	private LocalDate dataNascimento;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraUltimaAlteracao;

	public Conjuge(UUID idConjuge, @NotBlank String nome, @NotNull Sexo sexo, @NotBlank String celular,
			@NotNull LocalDate dataNascimento) {
		this.idConjuge = idConjuge;
		this.nome = nome;
		this.sexo = sexo;
		this.celular = celular;
		this.dataNascimento = dataNascimento;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

}
