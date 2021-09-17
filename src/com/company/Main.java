package com.company;

import com.company.exercicio2.ManipulaStrings;
import com.company.exercicio3.Retangulo;

public class Main {

    public static void main(String[] args) {

//        System.out.println("InverteString");
//        ManipulaStrings.inverteString("ola eu sou goku");
//        System.out.println("Palíndromo");
//        ManipulaStrings.palíndromo("SUBI NO ONIBUS");
        Retangulo.calculaArea(3.5d,4.0d);
        Retangulo.calculaPerimetro(3.5d,4.0d);
        Retangulo.quantidadePiso(0.25d, Retangulo.calculaArea(3.5d,4.0d));
        Retangulo.quantidadeRodape(0.25d,Retangulo.calculaPerimetro(3.5d,4.0d));
    }
}
