package com.resource.treino.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegiaoRequestDTO {
    private String cidade;
    private String estado;

}