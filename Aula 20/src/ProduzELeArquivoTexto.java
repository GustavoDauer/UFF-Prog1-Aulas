import java.io.*;
import javax.swing.JOptionPane;
import java.util.Formatter;
import java.util.Scanner;

public class ProduzELeArquivoTexto {
    public static void main(String [] args) throws IOException {
        Formatter arq = new Formatter("novo.txt");
        String linha = JOptionPane.showInputDialog("Diga linha: ");
        while(linha!=null && !linha.equals("")) {
            arq.format("%s", linha + "\n");
            linha = JOptionPane.showInputDialog("Diga proxima: ");
        }
        arq.close();
        // Ler arquivo
        Scanner arq2 = new Scanner(new File("novo.txt"));
        String resposta = "";
        while(arq2.hasNextLine())
            resposta += arq2.nextLine() + "\n";
        JOptionPane.showMessageDialog(null, resposta);
        arq2.close();
    }

}
