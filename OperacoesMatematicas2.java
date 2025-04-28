package com.mycompany.operacoesmatematicas2;

public class OperacoesMatematicas2 {

    public static void main(String[] args) {
        
        //1. Soma de 15 + 5
        System.out.println("Soma = " + soma(15, 5));
        
        //2. Subtração de 40 - 25
        System.out.println("Subtração = " + subtracao(40, 25));
        
        //3. Multiplicação de 7 * 100
        System.out.println("Multiplicação = " + multiplicacao(7, 100));
        
        //4. Divisão de 80 / 4
        System.out.println("Divisão = " + divisao(80, 4));
        
        //5. Resto da divisão 80 / 4
        System.out.println("Resto = " + resto(80, 4));
        
        //6. Área do quadrado (lado = 5)
        int ladoQuadrado = 5;
        System.out.println("Área do quadrado = " + areaQuadrado(ladoQuadrado));
        
        //7. Área do retângulo (base = 20, altura = 10)
        int baseRetangulo = 20, alturaRetangulo = 10;
        System.out.println("Área do retângulo = " + areaRetangulo(baseRetangulo, alturaRetangulo));
        
        //8. Área do losango (Diagonal maior = 8, diagonal menor = 4)
        double diagonalMaior = 8, diagonalMenor = 4;
        System.out.println("Área do losango = " + areaLosango(diagonalMaior, diagonalMenor));
        
        //9. Área do triângulo (base = 6, altura = 4)
        int baseTriangulo = 6, alturaTriangulo = 4;
        System.out.println("Área do triângulo = " + areaTriangulo(baseTriangulo, alturaTriangulo));
        
        //10. Área da circunferência (PI = 3.14, raio = 6)
        int raio = 6;
        System.out.println("Área da circunferência = " + areaCircunferencia(raio));
        
        //11. Média aritmética simples (5, 6, 7, 8, 9, 9, 10)
        int[] notas = {5, 6, 7, 8, 9, 9, 10};
        System.out.println("Média aritmética = " + mediaAritmetica(notas));
        
    }
    
    // Métodos:
    public static int soma(int a, int b) {
        return a + b;
    }
    
    public static int subtracao(int a, int b) {
        return a - b;
    }
    
    public static int multiplicacao(int a, int b) {
        return a * b;
    }
    
    public static double divisao(double a, double b) {
        return a / b;
    }
    
    public static int resto(int a, int b) {
        return a % b;
    }
    
    public static int areaQuadrado(int lado) {
        return lado * lado;
    }
    
    public static int areaRetangulo(int base, int altura) {
        return base * altura;
    }
    
    public static double areaLosango(double diagonalMaior, double diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2;
    }
    
    public static int areaTriangulo(int base, int altura) {
        return (base * altura) / 2;
    }
    
    public static double areaCircunferencia(double raio) {
        double PI = 3.14;
        return PI * raio * raio;
    }
    
   public static double mediaAritmetica(int[] valores) {
    int soma = 0;
    for (int valor : valores) {
        soma += valor;
    }
    if (valores.length == 0) {
        return 0;
    }
    return (double) soma / valores.length;
}
    
