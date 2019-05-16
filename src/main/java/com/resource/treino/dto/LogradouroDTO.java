package com.resource.treino.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LogradouroDTO {

    private String tipo;
    private String nome;
    private String numero;
    private String complemento;
}
