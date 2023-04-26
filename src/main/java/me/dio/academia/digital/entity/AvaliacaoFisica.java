package me.dio.academia.digital.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")

public class AvaliacaoFisica {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


  @ManyToOne
  @JoinColumn(name = "aluno_id")
  private Aluno aluno;

  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

  @Column(name="peso_atual")
  private double peso;

  @Column(name="altura_atual")
  private double altura;


public LocalDateTime getDataDaAvaliacao() {
  return dataDaAvaliacao;
}

  public Aluno getAluno() {
    return aluno;
  }

  public double getPeso() {
    return peso;
  }

  public double getAltura() {
    return altura;
  }

  public void setDataDaAvaliacao(LocalDateTime dataDaAvaliacao) {
  this.dataDaAvaliacao = dataDaAvaliacao;
}


public void setAluno(Aluno aluno) {this.aluno = aluno;}

public void setPeso(Object peso2) {
  this.peso= (double) peso2;
}

public void setAltura(Object altura2) {
  this.altura= (double) altura2;
}



}
