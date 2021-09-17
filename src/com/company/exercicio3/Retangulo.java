package com.company.exercicio3;

public class Retangulo {
    public static double calculaArea(double ladoA, double ladoB){
        Double areaTotal = ladoA*ladoB;
        System.out.println("A área do retangulo é: " + areaTotal + " metros quadrados");
        return areaTotal;
    }

    public static double calculaPerimetro(double ladoA, double ladoB){
        Double perimetro = ladoA + ladoA + ladoB + ladoB;
        System.out.println("O perímetro do retangulo é: " + perimetro + " metros");
        return perimetro;
    }

    public static void quantidadePiso(double areaLajota, double areaTotal){
        Double piso = areaTotal/areaLajota;
        System.out.println("A quantidade de piso necessária é de "+piso+" unidades");
    }

    public static void quantidadeRodape(double comprimentoLajota, double perimetro){
        Double rodape = perimetro/comprimentoLajota;
        System.out.println("A quantidade de rodapé necessária é de "+rodape+" unidades");
    }
}
