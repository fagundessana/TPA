/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematica;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class OperacoesMatematica {

    public static void main(String[] args) {
        //Definição de dois números 
        double num1 = 45.5;
        double num2 = 5.0;
        
        //Realizando operações matemáticas
   double soma = num1 + num2;
   double subtracao = num1 - num2;
   double multiplicacao = num1 * num2;
   double divisao = num2 !=0 ? num1 / num2 : Double.NaN; 
   double resto = num1 % num2;
   // Exibindo os resultados 
   System.out.println ("Resultados das operações");
   System.out.println("Soma:" + soma);
   System.out.println("Subtração:"+ subtracao);
   System.out.println("Multiplicação=" + multiplicacao);
   System.out.println("Divisão=" + divisao);
   System.out.println("Resto:" + (num2 != 0 ? divisao :
           "Indefiinida (divisão por zero)"));
   System.out.println("Resto:" + resto);
    }
}
