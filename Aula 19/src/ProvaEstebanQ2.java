import java.util.Scanner;
public class ProvaEstebanQ2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, y, xS, yS, xI, yI;
        System.out.println("Coordenadas superiores:");
        xS = teclado.nextInt();
        yS = teclado.nextInt();
        System.out.println("Coordenadas inferiores:");
        xI = teclado.nextInt();
        yI = teclado.nextInt();
        do{
            System.out.println("Coordenadas do ponto:");
            x = teclado.nextInt();
            y = teclado.nextInt();
            if ((x>=xS)&&(x<=xI)&&
                (y>=yS)&&(y<=yI)
               )
                System.out.println("Dentro");
            else
                System.out.println("Fora");
        } while ((x!=0)||(y!=0));
    }

}
