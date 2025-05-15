package br.pucrs.nomeusuario.exemplo.persistencia;

import jakarta.persistence.*;

@Entity
public class Livro {
    @Id
    private long id;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Editora editora;
    private String titulo;
    private String autor;
    private int ano;

    protected Livro() {        
    }

    public Livro(long id, Editora editora, String titulo, String autor, int ano) {
        this.id = id;
        this.editora = editora;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public long getId() {
        return id;
    }

    public Editora getEditora() {
        return editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

}
