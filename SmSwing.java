package com.mycompany.smswing;

import javax.swing.*;//importei a classe javax swing
public class SmSwing { //denominei a classe de SmSwing
    
    public static void main(String[] args) {
        double salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário mínimo (R$):"));//O usuário entra com o valor do salário mínimo atual
        double salarioUsuario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário (R$):"));//e depois entra com o valor de seu salário

        double quantidade = salarioUsuario / salarioMinimo;//é calculado a qunatidade de salários mínimos recebidos, e é especificado que a variável é double

        JOptionPane.showMessageDialog(null, "Você recebe " + quantidade + " salários mínimos.");//a mensagem no console dizendo quantos salários mínimos são recebidos pelo usuário
    }
}
