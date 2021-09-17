package com.company.exercicio2;

public class ManipulaStrings {

    public static void inverteString(String nome){
        String t = new StringBuilder(nome).reverse().toString();
        System.out.println(t);;
    }

    public static void palíndromo(String nome){
        String nomet = nome.replaceAll("\\s+","");
        String t = new StringBuilder(nomet).reverse().toString();
        if (nomet.equalsIgnoreCase(t)){
            System.out.println("É palíndromo");
        }else{
            System.out.println("Não é palíndromo");
        }
    }
}
