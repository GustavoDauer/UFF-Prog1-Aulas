
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20931131
 */
public class Exercicio2 {
    public static void verifica(String d) {
        boolean verificacao = false;
        char dna[] = d.toCharArray();
        for(int i=0;i<d.length();i++)
            if(dna[i]!='c' && dna[i] != 't' && dna[i] != 'a' && dna[i] != 'g' && dna[i]!='C' && dna[i] != 'T' && dna[i] != 'A' && dna[i] != 'G')
                verificacao = false;
            else
                verificacao = true;
        if(verificacao == true)
            JOptionPane.showMessageDialog(null, "Valido");
        else
            JOptionPane.showMessageDialog(null, "Invalido");

    }
    public static void main(String[] args) {
        String dna = JOptionPane.showInputDialog("DNA","CTAG");
        verifica(dna);
        while(!dna.equals("")) {
            dna = JOptionPane.showInputDialog("DNA:","CTAG");
            verifica(dna);
        }
    }
}
