/**
 *
 * @author Gustavo
 */
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula20 {
    public static void main(String[] args)throws IOException {
        Scanner arq = new Scanner(new File("meu.txt"));
        /*while(arq.hasNextInt())
            //System.out.print(arq.nextInt() + " ");
            JOptionPane.showInputDialog("Arquivo: "+arq.nextInt());
        arq.close();*/
        while(arq.hasNextLine())
            //System.out.print(arq.nextInt() + " ");
            JOptionPane.showInputDialog("Arquivo: "+arq.nextLine());
        arq.close();
    }
}
