package com.resource.treino.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EnderecoDTO {

    RegiaoDTO regiao;

    LogradouroDTO logradouro;

    DadosDTO dados;

}
