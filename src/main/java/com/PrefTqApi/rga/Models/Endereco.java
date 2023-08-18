package com.PrefTqApi.rga.Models;


import com.PrefTqApi.rga.RequestDto.DadosEndereco;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String numero;


    public Endereco(DadosEndereco dados) {
        this.rua = dados.rua();
        this.bairro = dados.bairro();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
    }
}
