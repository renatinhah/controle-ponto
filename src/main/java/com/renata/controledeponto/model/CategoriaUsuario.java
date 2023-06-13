package com.renata.controledeponto.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaUsuario {
    private long id;
    private String descricao;
}
