package com.mycompany.antesuceswing;

import javax.swing.*;//importei a classe javax swing
public class AnteSuceSwing {//denominei a classe de AnteSuceSwing
    
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));//e pedido um número inteiro

        int antecessor = numero - 1; //especifica que é uma variável do parâmetro int, e que o antecessor será o número - 1
        int sucessor = numero + 1;//especifica que é uma variável do parâmetro int, e que o sucessor será o número = 1

        JOptionPane.showMessageDialog(null, "Antecessor: " + antecessor + "\nSucessor: " + sucessor);//é mostrado no console o antecessor e o sucessor dos dados colocados
    }
}
