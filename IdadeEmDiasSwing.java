package com.mycompany.idadeemdiasswing;
import javax.swing.*;//importei a classe javax swing

public class IdadeEmDiasSwing {//denominei a classe de IdadeEmDiassSwing
    
    public static void main(String[] args) {
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade em anos:"));//entrada de dados dos em anos 
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade em meses:"));//entrada de dados em meses
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade em dias:"));//entrada dos dados em dias

        int totalDias = (anos * 365) + (meses * 30) + dias;

        JOptionPane.showMessageDialog(null, "Total em dias: " + totalDias);//aqui ocorre a saída dos dados em dias
    }
}

