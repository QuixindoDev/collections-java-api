package com.dio.study.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    List<Pessoa> pessoasList;

    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(pessoasList);
        Collections.sort(pessoasOrdenadas);
        return pessoasOrdenadas;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasOrdenadasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasOrdenadasPorAltura, new ComparatorPorAltura());
        return pessoasOrdenadasPorAltura;
    }
}
