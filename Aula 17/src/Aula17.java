/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Aula17 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
            // Exercicio 1
            //exercicio1();
            // Exercicio 2
            //exercicio2();
            // Exercicio 3
            exercicio3();
    }
        public static void escreverVetor(int v[]){
            System.out.println();
            System.out.printf("(4 ou 6) Escrevendo vetor\n");
            for(int i=0; i<v.length; i++){
                System.out.printf("vetor["+i+"]="+v[i]+"\n");
            }
        }
        public static void lerVetor(int v[]){
            System.out.printf("\n(2) Vetor construido:\n");
            System.out.printf("\n(3) Ler componentes do vetor:\n");
            for(int i=0; i < v.length; i++){
                System.out.printf("vetor["+i+"] = ");
                v[i] = teclado.nextInt();
            }
        }
        public static void ordenarVetor(int v[]){
            System.out.printf("\n(5) Ordenando vetor:\n");
            int aux;
            for(int i=0; i < v.length; i++)
                for(int j=i+1; j < v.length; j++)
                    if(v[i] > v[j]){
                        aux = v[i];
                        v[i] = v[j];
                        v[j] = aux;
                    }
        }
        public static void exercicio1(){
            int dimensao;
            System.out.printf("(1) Diga dimensao do vetor:\n");
            //JOptionPane.showMessageBox(null, "(1) Diga dimensao do vetor:");
            dimensao = teclado.nextInt();
            int vetor[] = new int [dimensao];
            lerVetor(vetor);
            escreverVetor(vetor);
            ordenarVetor(vetor);
            escreverVetor(vetor);
        }
        public static void lerMatriz(int m[][]){
            System.out.printf("\n(2) Matriz construida:\n");
            System.out.printf("\n(3) Ler componentes da Matriz (Random):\n");
            for(int i=0; i < m.length; i++){
                for(int j = 0; j < m[i].length; j++){
                    m[i][j] = (int)(100*Math.random());//teclado.nextInt();
                    System.out.printf("matriz["+i+"]["+j+"] = "+m[i][j]+"\n");
                }
            }
        }
        public static void escreverMatriz(int m[][]){
            System.out.println();
            System.out.printf("(4 ou 6) Escrevendo matriz\n");
            for(int i=0; i < m.length; i++){
                for(int j = 0; j < m[i].length; j++)
                    System.out.printf(m[i][j]+" ");
                System.out.println();
            }
        }
        public static void identificarEZerarMaiorValor(int m[][]){
            System.out.printf("\n(5) Identificando maior valor:\n");
            int maior = m[0][0];
            for(int i=0; i < m.length; i++)
                for(int j = 0; j < m[i].length; j++)
                    if(m[i][j] > maior)
                        maior = m[i][j];
            for(int i=0; i < m.length; i++)
                for(int j = 0; j < m[i].length; j++)
                    if(m[i][j] == maior)
                        m[i][j] = 0;
        }
        public static void exercicio2(){
            int dimensao;
            System.out.printf("(1) Diga dimensao da matriz:\n");
            //JOptionPane.showMessageBox(null, "(1) Diga dimensao do vetor:");
            dimensao = teclado.nextInt();
            int matriz[][] = new int [dimensao][dimensao];
            lerMatriz(matriz);
            escreverMatriz(matriz);
            identificarEZerarMaiorValor(matriz);
            escreverMatriz(matriz);
        }
        public static void escreverNomes(String v[]){
            System.out.println();
            System.out.printf("(4 ou 6) Escrevendo vetor\n");
            for(int i=0; i<v.length; i++){
                System.out.printf("vetor["+i+"]="+v[i]+"\n");
            }
        }
        public static void lerNomes(String v[]){
            System.out.printf("\n(2) Vetor construido:\n");
            System.out.printf("\n(3) Ler componentes do vetor:\n");
            for(int i=0; i < v.length; i++)
                v[i] = JOptionPane.showInputDialog(null, "v["+i+"]");
        }

        public static void removerMenor(String v[]){
            System.out.printf("\n(2) Removendo menor\n");
            int menor = 0;
            //for(int i=1; i < v.length; i++)
                //if(v[i].compareTo(v[i-1]))
        }
        public static void exercicio3(){
            int dimensao;
            JOptionPane.showMessageDialog(null, "(1) Diga dimensao do vetor:\n");
            dimensao = Integer.parseInt(JOptionPane.showInputDialog(null, "Dimensao"));
            String nomes[] = new String [dimensao];
            lerNomes(nomes);
            escreverNomes(nomes);
            removerMenor(nomes);
            escreverNomes(nomes);
        }
}