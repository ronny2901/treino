package com.resource.treino.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosRequestDTO {

    private String cep;
    private String bairro;
}