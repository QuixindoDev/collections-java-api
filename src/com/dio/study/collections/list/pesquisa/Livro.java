package com.dio.study.collections.list.pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "{" +
                "anoPublicacao=" + anoPublicacao +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
