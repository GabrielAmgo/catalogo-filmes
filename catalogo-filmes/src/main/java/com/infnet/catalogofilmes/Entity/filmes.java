package com.infnet.catalogofilmes.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class filmes {
    private Integer id;
    private String nome;
    private int anoLancamento;
    private String diretor;
    private String genero;
    private int nota;


    }