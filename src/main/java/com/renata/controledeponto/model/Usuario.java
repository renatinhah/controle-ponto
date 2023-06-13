package com.renata.controledeponto.model;

import lombok.*;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {
    private long id;
    private String nome;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private Localidade finalJornada;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario; // varios usuarios para uma categoria
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;

}
