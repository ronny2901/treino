package com.resource.treino.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoSoapResponse {

    private String bairro;
    private String cep;
    private String cidade;
    private String complemento2;
    private String end;
    private String uf;
}
