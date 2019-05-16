package com.resource.treino.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosDTO {

    private int cep;
    private String bairro;
}
