/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula26;

import javax.swing.JOptionPane;

/**
 *
 * @author prog1c
 */
public class Exercicio1 {

    public static void mostra(int [] vs)
    {
        String resp="";
        for (int i=0; i < vs.length; i++)
        {
            resp += " " + vs[i];
        }
        JOptionPane.showMessageDialog(null, resp);
    }
    public static void geraVetor(int [] gs)
    {
        for (int i = 0; i < gs.length; i++)
        {
            gs[i] = 2 + (int)(Math.random()*999);
        }
    }
    public static int[] retornaPrimos(int [] rs) //incompleto
    {
        int cont = 0;
        for (int i = 0; i < rs.length; i++)
        {
                     
        }        
        return null;
    }
    public static void main(String[] args) {
        int dimensao = Integer.parseInt(JOptionPane.showInputDialog("Dimesnsao do vetor:"));
        int [] vetor = new int [dimensao];
        int [] primos;
        mostra(vetor);
        geraVetor(vetor);
        mostra(vetor);
        primos = retornaPrimos(vetor);
        mostra(primos);
        
    }

}
