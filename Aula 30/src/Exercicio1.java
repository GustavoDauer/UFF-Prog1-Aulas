
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20931131
 */
public class Exercicio1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Linhas: "));
        int n[] = new int[5];
        String nome = JOptionPane.showInputDialog("Nome: ") + ".txt";
        String resposta = "";
        Formatter arquivo = new Formatter(new File(nome));

        for(int i=0;i<linhas;i++) {
            for(int j=0;j<5;j++)
                n[j] = (int)(1000*Math.random());
            for(int k=0;k<5;k++)
                arquivo.format("%d ", n[k]);
            arquivo.format("\n");
        }
        arquivo.close();

        

        Scanner ler = new Scanner(new File(nome));
        while(ler.hasNextLine())
            resposta += ler.nextLine() + "\n";
        ler.close();
        JOptionPane.showMessageDialog(null, resposta);
    }
}
