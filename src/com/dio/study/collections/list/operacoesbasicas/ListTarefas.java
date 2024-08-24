package com.dio.study.collections.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListTarefas {
    private List<Tarefa> listTarefas;

    public ListTarefas() {
        this.listTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : listTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao))
                tarefasParaRemover.add(t);
        }

        listTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listTarefas);
    }

    public static void main(String[] args) {
        ListTarefas listTarefas1 = new ListTarefas();

        System.out.println("O numero de elementos na lista de tarefas eh de "+listTarefas1.obterNumeroTotalTarefas());

        listTarefas1.adicionarTarefa("Tarefa1");
        listTarefas1.adicionarTarefa("Tarefa1");
        listTarefas1.adicionarTarefa("Tarefa2");
        System.out.println("O numero de elementos na lista de tarefas eh de "+listTarefas1.obterNumeroTotalTarefas());

        listTarefas1.removerTarefa("Tarefa2");
        System.out.println("O numero de elementos na lista de tarefas eh de "+listTarefas1.obterNumeroTotalTarefas());

        listTarefas1.obterDescricoesTarefas();
    }
}
