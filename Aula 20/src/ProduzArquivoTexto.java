import java.io.*;
import java.util.Formatter;
import javax.swing.JOptionPane;

public class ProduzArquivoTexto {
    public static void main(String[] args) throws IOException {
        Formatter arq = new Formatter("novo.txt");
        String linha = JOptionPane.showInputDialog("Diga uma nova linha:");
        while(linha != null && !linha.equals("")){
            arq.format("%s", linha+"\n");
            linha = JOptionPane.showInputDialog("Diga a proxima: ");
        }
        arq.close();
    }
}

/*public static void main(String[] args) { {
        try {
            Formatter arq = new Formatter("novo.txt");
            String linha = JOptionPane.showInputDialog("Diga uma nova linha:");
            while(linha != null && !linha.equals("")){
                arq.format("%s", linha+"\n");
                linha = JOptionPane.showInputDialog("Diga a proxima: ");
            }
            arq.close();
        }
        catch(IOException e){
            System.out.println("Erro");
        }
    }*/
