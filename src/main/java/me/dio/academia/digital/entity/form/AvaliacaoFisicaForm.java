package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "O Id do aluno precisa ser positivo.")
  private Long alunoId;

  @NotNull(message = "Preencha o campo corretamente.")
  @Positive(message = "${validatedValue}' precisa ser positivo.")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente.")
  @Positive(message = "${validatedValue}' precisa ser positivo.")
  @DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")
  private double altura;



public void setAltura(double altura) {
    this.altura = altura;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public void setAlunoId(Long alunoId) {this.alunoId = alunoId;}
public Long getAlunoId() {
        return alunoId;
    }

public Object getPeso() {
    return peso;
}

public Object getAltura() {
    return altura;
}

}
