package com.company.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private Integer pos;

    //armazena pessoas
    List<Pessoa> pessoa = new ArrayList<>();

    //metodo armazenar pessoas
    public void armazenarPessoa(Pessoa pessoa){
        this.pessoa.add(pessoa);
    }

    public void removerPessoa(String nome){
        this.pessoa.remove(nome);
    }

    public int buscarPessoa(String nome){
        for(int i = 0; i < pessoa.size(); i++){
            Pessoa p = pessoa.get(i);
            if(p.getNome().equals(nome)) {
                pos = i;
            }
        }
        return pos;
    }

    public void exibirTodaAgenda(){
        for (Pessoa agendaInteira: pessoa) {
            System.out.println(agendaInteira);
        }
    }

    public void exibirPessoa(int index){
        System.out.println(pessoa.get(index));
    }
}
