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
public class Exercicio4 {

    public Exercicio4() {
        String num=JOptionPane.showInputDialog(null,"Didite um inteiro");
        int rep=Integer.parseInt( JOptionPane.showInputDialog(null,"digite um inteiro"));
        
     JOptionPane.showMessageDialog(null,num+" tem o "+rep+" repetido "+repetido(num,rep)+" vezes ");   
    }


    private  int repetido(String num,int rep){
       int cont=0;
       boolean t=false;
        for (int i = 0; i < num.length(); i++) {
           
        if(rep==((int) num.charAt(i)-48)){
            t=true;
           cont++;
           // System.out.println(num.charAt(i)+" e igual a"+rep);
        }
//        System.out.println(num.charAt(i));
//        System.out.println(rep);
//        System.out.println(t);
        }
             return cont;
    }
    
   
    public static void main(String[] args) {
       new Exercicio4();
    }
} 

