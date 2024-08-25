package com.dio.study.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public Object pesquisarPorAutor(String autor){
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro l: livros){
            if (l.getAutor().equalsIgnoreCase(autor)){
                livrosEncontrados.add(l);
            }
        }

        if (livrosEncontrados.isEmpty())
            return "Nenhum livro de "+autor+" foi encontrado.";

        return livrosEncontrados;
    }


    public Object pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro l: livros){
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                livrosEncontrados.add(l);
        }
        if (livrosEncontrados.isEmpty())
            return "Nenhum livro neste intervalo de tempo foi encontrado "+anoInicial+"-"+anoFinal;

        return livrosEncontrados;
    }

    public Object pesquisarPorTitulo(String titulo) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro l: livros){
            if (l.getTitulo().equalsIgnoreCase(titulo))
                livrosEncontrados.add(l);
        }
        if (livrosEncontrados.isEmpty())
            return "O livro "+titulo+" nao foi encontrado";

        return livrosEncontrados;
    }

    public static void main(String[] args) {
        CatalogoLivros c = new CatalogoLivros();
        c.adicionarLivro("A culpa e das estrelas", "QUixindo", 2000);
        c.adicionarLivro("A culpa e das estrelas 2", "QUixindo", 2000);
        c.adicionarLivro("A culpa e das estrelas 3", "Lorena", 2005);
        System.out.println(c.pesquisarPorIntervaloAnos(2002, 2005));
        System.out.println(c.pesquisarPorAutor("Messias"));
        System.out.println(c.pesquisarPorTitulo("A culpa e das estrelas"));
    }
}
