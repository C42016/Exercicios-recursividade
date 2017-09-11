/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficha6;

import javax.swing.JOptionPane;

/**
 *
 * @author Ubisse
 */
public class Exercicio2 {

    int x;
    int y;

    public Exercicio2() {
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Digite outro inteiro"));
      
        JOptionPane.showMessageDialog(null, multiplicar(x, y));
    }

    private int multiplicar(int x, int y) {
      
        if (x == 1) 
            return y;
        
        return y+multiplicar(x-1,y);
     
    }

    public static void main(String[] args) {
        new Exercicio2();
    }

}
