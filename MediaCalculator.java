
package com.mycompany.mediacalculator;

//importei a classe scanner e a locale para padronizar a resposta dos caracteres
import java.util.Scanner;
import java.util.Locale;

public class MediaCalculator {// denominei a classe de MediaCalculator

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar;// //Responsável por controlar o fluxo do loop 

        //é pedido os números para que seja calculado as médias
        do {
            System.out.println("\nDigite as 4 notas:");
            
            double[] notas = new double[4];
            for (int i = 0; i < 4; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
                scanner.nextLine(); 
            }
            
            double media = calcularMedia(notas);
            System.out.printf("Média: %.2f - %s%n", media, verificarSituacao(media));
            
            continuar = verificarNovoCalculo(scanner);
        } while (continuar);
        
        scanner.close();
    }
    //Nesta classe é calculado a média das notas
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    //e nesta classe é verificado a situação do usuário
    public static String verificarSituacao(double media) {
        if (media >= 7) { //se a média for maior ou igual a 7, o usuário foi aprovado
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação"; //se a média for maior ou igual a 5, o usuário está de recuperação 
        } else {
            return "Reprovado"; //e caso a média seja menor que 5, o usuário foi reprovado
        }
    }

    public static boolean verificarNovoCalculo(Scanner scanner) { //Nesta classe é perguntado ao usuário se ele deseja fazer uma nova verificação
        System.out.print("\nDeseja calcular outra média? (SIM ou NAO): ");
        String resposta = scanner.nextLine().toUpperCase(Locale.ROOT);
        return !resposta.equals("NAO");
    }
}