package com.resource.treino.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EnderecoResponseDTO {

    RegiaoResponseDTO regiao;

    String logradouro;

    DadosResponseDTO dados;

}
