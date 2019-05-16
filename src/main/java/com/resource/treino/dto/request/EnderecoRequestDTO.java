package com.resource.treino.dto.request;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class EnderecoRequestDTO {

    RegiaoRequestDTO regiao;

    LogradouroRequestDTO logradouro;

    DadosRequestDTO dados;

}
