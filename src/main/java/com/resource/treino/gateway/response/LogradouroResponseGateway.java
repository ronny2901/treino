package com.resource.treino.gateway.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LogradouroResponseGateway {

    private String tipo;
    private String nome;
    private String numero;
    private String complemento;
}
