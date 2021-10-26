/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula27;

import javax.swing.JOptionPane;

/**
 *
 * @author 20931131
 */
public class Exercicio1 {
    public static String transforma(String n) {
        String[] nomes;
        String resposta;
        nomes = n.split(" ");
        resposta = nomes[nomes.length-1]+", ";
        for(int i=0;i<nomes.length-1;i++)
            if(nomes[i].length() > 2)
                resposta += nomes[i].subSequence(0, 1)+". ";
        return resposta;
    }

    public static void main(String[] args) {
        String nome = "";
        int i = 1;
        nome = JOptionPane.showInputDialog(null, "Digite o nome "+i);
        JOptionPane.showMessageDialog(null, transforma(nome));
        i++;
        while(!nome.isEmpty()) {
            nome = JOptionPane.showInputDialog(null, "Digite o nome "+i);
            JOptionPane.showMessageDialog(null, transforma(nome));
            i++;
        }
    }

}
