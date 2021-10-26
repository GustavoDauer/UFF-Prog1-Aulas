/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula28;

import javax.swing.JOptionPane;

/**
 *
 * @author prog1
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void verificaURL(String[] p, String u) {
        String[] partesURL = u.split("\\.");
        String resposta = "";
        for(int i=0;i<partesURL.length;i++)
            for(int j=0;j<p.length;j++) {
                if(partesURL[i].equals(p[j])) {
                    resposta += p[j] + "\n";
                }
            }
        JOptionPane.showMessageDialog(null, "Palavras encontradas:\n\n"+resposta);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String[] proibidos = {"jogos", "batepapo", "orkut", "msn"};
        String URL = JOptionPane.showInputDialog("Informe a URL");
        verificaURL(proibidos, URL);
    }

}
