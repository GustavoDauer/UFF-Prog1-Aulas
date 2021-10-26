import java.util.Scanner;
public class ProvaEstebanQ4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Diga x, y, z:");
        double x = teclado.nextDouble();
        double y = teclado.nextDouble();
        double z = teclado.nextDouble();
        double distancia;
        distancia = Math.sqrt(
                               Math.pow(x, 2)+
                               Math.pow(y, 2)+
                               Math.pow(z, 2)
                             );
        System.out.println(distancia);
    }

}
