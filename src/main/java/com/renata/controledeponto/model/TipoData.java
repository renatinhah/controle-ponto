package com.renata.controledeponto.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class TipoData {
    private long id;
    private String descricao;
}
