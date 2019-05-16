package com.resource.treino.gateway.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegiaoResponseGateway {
    private String cidade;
    private String estado;
}
