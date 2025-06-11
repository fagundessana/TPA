package com.mycompany.scannerexample;

//importei a classe scanner e a locale para padronizar a resposta dos caracteres
import java.util.Scanner;
import java.util.Locale;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar;//Responsável por controlar o fluxo do loop
        
        // Aqui é pedido os números para a realização da operação
        do {
            System.out.println("Digite o num1");
            int num1 = scanner.nextInt();
            
            System.out.println("Digite a operacao (+, -, *, /)");
            String operacao = scanner.next();
            
            System.out.println("Digite o num2");
            int num2 = scanner.nextInt();
            
            int resultado = calcular(num1, num2, operacao);
            System.out.println("Resultado: " + resultado);
            
            continuar = verificarNovaOperacao(scanner);
        } while (continuar);
        
        scanner.close();
    }
     
    //O loop se inicia aqui, perguntando se o usuário deseja fazer uma nova operação
    public static boolean verificarNovaOperacao(Scanner scanner) {
        System.out.println("Deseja realizar uma nova operacao? (SIM ou NAO):");
        scanner.nextLine();
        return !scanner.nextLine().toUpperCase(Locale.ROOT).equals("NAO");
    }

    //Aqui ocorre a realização dos cálculos
    public static int calcular(int n1, int n2, String operacao) {
        int respostaCalculo = 0;
        
        switch (operacao) {
            case "+":
                respostaCalculo = n1 + n2;
                break;
                
            case "-":
                respostaCalculo = n1 - n2;
                break;
                
            case "*":
                respostaCalculo = n1 * n2;
                break;
                
            case "/":
                if (n2 == 0) {
                    System.out.println("Erro: Divisão por zero!");//mensagem de erro, pois é uma divisão por zero
                    return 0; 
                }
                respostaCalculo = n1 / n2;
                break;
                
            default:
                System.out.println("Operação inválida =(");//mensagem de erro
        }
        //E aqui retorna o resultado do cálculo
        return respostaCalculo;
    }
}
