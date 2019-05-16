package com.resource.treino.gateway.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LogradouroRequestGateway {
    private String tipo;
    private String nome;
    private String numero;
    private String complemento;
}
