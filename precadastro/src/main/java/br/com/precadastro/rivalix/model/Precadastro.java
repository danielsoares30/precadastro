package br.com.precadastro.rivalix.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "precadastro")
public class Precadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Corrigido aqui

    @Column(name = "id")
    private Integer id;
    @Column(name = "nome", length=200, nullable=true)
    private String nome;
    @Column(name = "email", length=50, nullable=true)
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
