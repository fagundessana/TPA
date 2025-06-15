package com.mycompany.primechecker;
//importei a classe scanner e a locale para padronizar a resposta dos caracteres
import java.util.Scanner;
import java.util.Locale;

public class PrimeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar;

        do {
            System.out.print("\nDigite um numero inteiro positivo: ");//pede para inserir um número inteiro positivo
            int numero = scanner.nextInt();
            
            if (numero < 2) {
                System.out.println("Numeros menores que 2 nao sao primos.");
            } else {
                boolean ehPrimo = verificarPrimo(numero);
                System.out.println(numero + (ehPrimo ? " e um numero primo." : " nao e um numero primo."));
            }
            
            continuar = verificarNovaVerificacao(scanner);
        } while (continuar);
        
        scanner.close();
    }

    public static boolean verificarPrimo(int numero) {
        //verifica divisores até a raiz quadrada do número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean verificarNovaVerificacao(Scanner scanner) {
        System.out.print("\nDeseja verificar outro numero? (SIM ou NAO): ");//exibe essa mensagem ao usuário
        scanner.nextLine(); 
        return !scanner.nextLine().toUpperCase(Locale.ROOT).equals("NAO");
    }
}
