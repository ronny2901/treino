package com.resource.treino.gateway.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EnderecoRequestGateway {

    RegiaoRequestGateway regiao;

    LogradouroRequestGateway logradouro;

    DadosRequestGateway dados;

}
