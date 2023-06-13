package com.renata.controledeponto.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {
    private long id;
    private TipoData tipoData;
    private String descricao;
    private Localidade dataEspecial;

}
