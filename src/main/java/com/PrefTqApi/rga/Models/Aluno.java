package com.PrefTqApi.rga.Models;

import com.PrefTqApi.rga.RequestDto.DadosAluno;
import com.PrefTqApi.rga.RequestDto.DadosEndereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name= "alunos")
@Entity(name= "aluno")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Aluno {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    private String datanascimento;
    @Enumerated(EnumType.STRING)
    private Portador portador;

    @Embedded
    private Endereco endereco;


    public Aluno(DadosAluno dados) {
        this.nome = dados.nome();
        this.datanascimento = dados.datanascimento();
        this.portador = dados.portador();
        this.endereco = new Endereco(dados.endereco());

    }
}
