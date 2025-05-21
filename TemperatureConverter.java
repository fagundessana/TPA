package com.mycompany.temperatureconverter;

import java.util.Scanner;
import java.util.Locale;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar;

        do {
            System.out.println("\nEscolha a conversao desejada:");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("3 - Celsius para Kelvin");
            System.out.println("4 - Kelvin para Celsius");
            System.out.println("5 - Fahrenheit para Kelvin");
            System.out.println("6 - Kelvin para Fahrenheit");
            System.out.print("Opcao: ");
            
            int opcao = scanner.nextInt();
            
            System.out.print("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();
            
            double resultado = converterTemperatura(opcao, temperatura);
            System.out.printf("Resultado: %.2f%n", resultado);
            
            continuar = verificarNovaConversao(scanner);
        } while (continuar);
        
        scanner.close();
    }

    public static double converterTemperatura(int opcao, double temperatura) {
        switch (opcao) {
            case 1: // Celsius para Fahrenheit
                return (temperatura * 9/5) + 32;
            case 2: // Fahrenheit para Celsius
                return (temperatura - 32) * 5/9;
            case 3: // Celsius para Kelvin
                return temperatura + 273.15;
            case 4: // Kelvin para Celsius
                return temperatura - 273.15;
            case 5: // Fahrenheit para Kelvin
                return (temperatura - 32) * 5/9 + 273.15;
            case 6: // Kelvin para Fahrenheit
                return (temperatura - 273.15) * 9/5 + 32;
            default:
                System.out.println("Opcao inválida!");
                return 0;
        }
    }

    public static boolean verificarNovaConversao(Scanner scanner) {
        System.out.print("\nDeseja realizar uma nova conversao? (SIM ou NAO): ");
        scanner.nextLine(); // Limpar buffer
        return !scanner.nextLine().toUpperCase(Locale.ROOT).equals("NAO");
    }
}