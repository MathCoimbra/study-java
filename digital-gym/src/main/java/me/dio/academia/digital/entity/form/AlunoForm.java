package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotEmpty(message = "O campo nome está pendente, por favor preencher")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
  private String nome;

  @NotEmpty(message = "O campo cpf está pendente, por favor preencher")
  @CPF(message = "CPF '${validatedValue}' é inválido")
  private String cpf;

  @NotEmpty(message = "O campo bairro está pendente, por favor preencher")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
  private String bairro;

  @NotNull(message = "O campo data de nascimento está pendente, por favor preencher")
  @Past(message = "Data '${validatedValue}' é inválida")
  private LocalDate dataDeNascimento;
}
