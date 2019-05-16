package com.resource.treino.gateway.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosResponseGateway {

    private int cep;
    private String bairro;
}
