package com.resource.treino.gateway.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegiaoRequestGateway {
    private String cidade;
    private String estado;

}