package com.mycompany.tabuada;

//importei a classe scanner e a locale para padronizar a resposta dos caracteres
import java.util.Scanner;
import java.util.Locale;

public class Tabuada { //denominei a classe de tabuada

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar;//Responsável por controlar o fluxo do loop

        do {
            System.out.print("\nDigite um numero para ver sua tabuada: ");//pede para o usuário digitar um número
            int numero = scanner.nextInt();
            scanner.nextLine();
            
            exibirTabuada(numero);
            
            continuar = verificarNovaTabuada(scanner);
        } while (continuar);
        
        scanner.close();//fecha a classe
    }

    public static void exibirTabuada(int numero) { //classe para exibir a tabuada do número
        System.out.println("\nTabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }

    public static boolean verificarNovaTabuada(Scanner scanner) { // é perguntado para o usuário se ele deseja fazer uma nova verificação
        System.out.print("\nDeseja ver outra tabuada? (SIM ou NAO): ");
        String resposta = scanner.nextLine().toUpperCase(Locale.ROOT);
        return !resposta.equals("NAO");
    }
}