package com.resource.treino.gateway.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EnderecoResponseGateway {

    RegiaoResponseGateway regiao;

    LogradouroResponseGateway logradouro;

    DadosResponseGateway dados;

}
