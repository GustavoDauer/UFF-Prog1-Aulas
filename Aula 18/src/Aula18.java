/**
 *
 * @author Gustavo
 */

import java.util.Scanner;
public class Aula18 {
    static Scanner teclado = new Scanner(System.in);
    public static boolean palindromo(String tx){
        int i = 0;
        while((i <= tx.length()/2) && tx.charAt(i) == tx.charAt(tx.length()-1-i)) {
            i++;
        }
        return i > tx.length()/2;
    }

    public static void exercicio1(){
        String texto;
        texto = teclado.nextLine();
        while(!texto .equals("")){
            if(palindromo(texto))
                System.out.println("Palindromo");
            else
                System.out.println("Não é Palindromo");
           texto = teclado.nextLine(); 
        }


    }
    public static void main(String[] args) {
        exercicio1();
    }

}
