package com.company.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    //armazena pessoas
    List<Pessoa> pessoa = new ArrayList<>();

    //metodo armazenar pessoas
    public void armazenarPessoa(Pessoa pessoa){
        this.pessoa.add(pessoa);
    }

    public void removerPessoa(String nome){

    }

    public int buscarPessoa(String nome){

    }

    public void exibirTodaAgenda(){

    }

    public void exibirPessoa(int index){}
}
