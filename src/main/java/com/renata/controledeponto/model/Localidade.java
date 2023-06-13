package com.renata.controledeponto.model;

import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Localidade {
    private long id;
    private String descricao;
    @ManyToOne
    private NivelAcesso nivelAcesso; // varios niveis de acesso podem estar associados a uma localidade
}
