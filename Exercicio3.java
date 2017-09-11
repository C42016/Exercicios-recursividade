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
public class Exercicio3 {
int d;
    public Exercicio3() {
        int num=0;
         num=Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
        JOptionPane.showMessageDialog(null, somar(num,d));
       
    }
    /*
    Metodo que soma os digitos de um numero inteiro
    @param int num;
    @param int d
    */
    private int somar(int num,int d){
        if (num==0)
            return d;
        return d+somar(num/10,num%10);
    }
    public static void main(String[] args) {
        new Exercicio3();
    }
    
}
