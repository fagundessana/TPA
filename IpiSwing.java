package com.mycompany.ipiswing;

import javax.swing.*;//importei a classe javax swing
public class IpiSwing { //denominei a classe de IpiSwing
    
    public static void main(String[] args) {
        double ipi = Double.parseDouble(JOptionPane.showInputDialog("Informe o IPI (%):"));

        int cod1 = Integer.parseInt(JOptionPane.showInputDialog("Código da peça 1:"));//aqui é pedido para o usuário entar com o código da peça 1
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor unitário da peça 1:"));// já aqui é pedido o valor unitário da peça 1
        int quant1 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade da peça 1:"));// e aqui a quantidade da peça 1

        int cod2 = Integer.parseInt(JOptionPane.showInputDialog("Código da peça 2:"));//aqui é pedido para o usuário entar com o código da peça 2
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor unitário da peça 2:"));// já aqui é pedido o valor unitário da peça 2
        int quant2 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade da peça 2:"));// e aqui a quantidade da peça 2


        double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);//cálculo do total das variáveis colocadas

        JOptionPane.showMessageDialog(null, "Valor total com IPI: R$ " + total);//mensagem do total com IPI
    }
}
