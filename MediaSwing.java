package com.mycompany.mediaswing;

import javax.swing.*;//importei a classe javax swing

public class MediaSwing { //denominei a classe de MediaSwing
    
    public static void main(String[] args) {
        double media1 = (5 + 9 + 7) / 3.0;// especifica que a variável deve ser double
        double media2 = (4 + 4 + 10) / 3.0;
        double soma = media1 + media2;
        double mediaFinal = soma / 2;//aqui é calculado a média final das médias
       
        //aqui é mostrado as mensagens no console
        String mensagem = "Média 1 (5, 9, 7): " + media1 +
                          "\nMédia 2 (4, 4, 10): " + media2 +
                          "\nSoma das médias: " + soma +
                          "\nMédia das médias: " + mediaFinal;//o resultado da média final

        JOptionPane.showMessageDialog(null, mensagem);
    }
}

