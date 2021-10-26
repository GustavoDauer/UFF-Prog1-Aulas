import java.util.Scanner;
public class ProvaEstebanQ1 {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int inicio = (int) (10001*Math.random());
            int fim = inicio+100;
            int sorteado = inicio+(int)(101*Math.random());
            System.out.print("Diga um número entre "+inicio+" e "+fim+": ");
            int chute = teclado.nextInt();
            int contagem = 2;
            while ((contagem<=10)&&(chute!=sorteado)){
                if (chute<sorteado)
                    System.out.println("Abaixo");
                else
                    System.out.println("Acima");
                System.out.print("Errou - Tente outro número entre "+inicio+" e "+fim+": ");
                chute = teclado.nextInt();
                contagem++;
            }
            if (contagem>10)
                System.out.println("Errou todas tentativas e o número era: "+sorteado);
            else
                System.out.println("Parabéns o sorteado era "+sorteado);
    }
}

