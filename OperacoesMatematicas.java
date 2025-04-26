package com.mycompany.operacoesmatematicas;

/**
 *
 * @author Ana Beatriz
 */
public class OperacoesMatematicas {

    public static void main(String[] args) {
        // Definição de dois números 
        int n1 = 15;
        int n2 = 5;
        double PI = 3.14;
        double r = 5;

        // Realizando operações matemáticas
        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        double divisao = (n2 != 0) ? ((double) n1 / n2) : Double.NaN;
        int resto = n1 % n2;
        int areaQuadrado = n2 * n2;
        int areaRetangulo = n1 * n2;
        int areaLosango = n1 * n2 / 2;
        int areaTriangulo = n1 * n2 / 2;
        double areaCircunferencia = r * PI;
        int media = (n1 + n2) / 2;

        // Exibição dos valores
        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Resto = " + (n2 != 0 ? resto : "Indefinido (divisão por zero)"));
        System.out.println("Área quadrado = " + areaQuadrado);
        System.out.println("Área retângulo = " + areaRetangulo);
        System.out.println("Área losango = " + areaLosango);
        System.out.println("Área triângulo = " + areaTriangulo);
        System.out.println("Área circunferência = " + areaCircunferencia);
        System.out.println("Média = " + media);
    }
}
