package com.github.acnaweb.study_apiw.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produto {

    @Id
    private Long id;
    private String nome;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
