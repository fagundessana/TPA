package com.mycompany.temperatureconverter;

//importei a classe scanner e a locale para padronizar a resposta dos caracteres
import java.util.Scanner;
import java.util.Locale;

public class TemperatureConverter { //denominei a classe de TemperatureConverter

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar;//Responsável por controlar o fluxo do loop

        do {
            System.out.println("\nEscolha a conversao desejada:");// aqui é pedido para o usuário escolher que tipo de conversão deseja fazer
            System.out.println("1 - Celsius para Fahrenheit");//Celsius para Fahrenheit
            System.out.println("2 - Fahrenheit para Celsius");//Fahrenheit para Celsius
            System.out.println("3 - Celsius para Kelvin");//Celsius para Kevin
            System.out.println("4 - Kelvin para Celsius");//Kelvin para Celsius 
            System.out.println("5 - Fahrenheit para Kelvin");//Fahrenheit para Kelvin
            System.out.println("6 - Kelvin para Fahrenheit");//Kelvin para Fahrenheit
            System.out.print("Opcao: ");
            
            int opcao = scanner.nextInt();
            
            System.out.print("Digite a temperatura: "); // é pedido para digitar a temperatura que o usuário deseja converter
            double temperatura = scanner.nextDouble();
            
            double resultado = converterTemperatura(opcao, temperatura);//determiina que a variável utilizada é a double
            System.out.printf("Resultado: %.2f%n", resultado);// exibe o resultado da conversão
            
            continuar = verificarNovaConversao(scanner);
        } while (continuar);
        
        scanner.close();//fecha a classe
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
                System.out.println("Opcao inválida!");//exibe a mensagem opção inválida
                return 0;
        }
    }

    public static boolean verificarNovaConversao(Scanner scanner) { //Nesta classe é perguntado ao usuário se ele deseja fazer uma nova verificação
        System.out.print("\nDeseja realizar uma nova conversao? (SIM ou NAO): ");
        scanner.nextLine(); 
        return !scanner.nextLine().toUpperCase(Locale.ROOT).equals("NAO");
    }
}
