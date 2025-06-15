package com.mycompany.reajusteswing;
 import javax.swing.*;//importei a classe javax swing

public class ReajusteSwing { //denominei a classe de ReajusteSwing
    
    public static void main(String[] args) {
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo:"));//É pedido para o usuário entrar com os dados do saldo
        double saldoReajustado = saldo * 1.01;//aqui está o cálculo do rejuste de 1%

        JOptionPane.showMessageDialog(null, "Saldo com reajuste de 1%: R$ " + saldoReajustado);//aqui mostra o valor que ficou após o reajuste
    }
}

 