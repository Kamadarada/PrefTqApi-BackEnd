package com.PrefTqApi.rga.RequestDto;


import com.PrefTqApi.rga.Models.Portador;

public record DadosAluno(
String nome,
String datanascimento,
Portador portador,

DadosEndereco endereco
) {

}
