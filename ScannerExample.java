/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scannerexample;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome=scanner.nextLine();
        
    //leitura do número inteiro
    System.out.print("Digite sua idade");
    int idade=scanner.nextInt();
    System.out.print("Oi, "+ nome+ " !Você tem" +idade+"anos");
    scanner.close();
    }
}
