package com.resource.treino.gateway.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosRequestGateway {

    private String cep;
    private String bairro;
}