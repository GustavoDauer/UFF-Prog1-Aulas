/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula15;

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   public static void preenche(int vs[]) {
		for (int i = 0; i < vs.length; i++)
			vs[i] = (int) (100 * Math.random());
	}

	public static void mostra(int vs[]) {
		for (int i = 0; i < vs.length; i++)
			System.out.print(vs[i] + " ");
		System.out.println();
	}

	public static void identificaEEscreveMaiorMenorVizinhanca(int vs[]) {
		int maior=0;
		int menor=0;
		int somaMaior=vs[1];
		int somaMenor=vs[1];
		int soma;
		for (int i=1; i<vs.length-1;i++){
			soma=vs[i-1]+vs[i+1];
			if (soma>somaMaior){
				somaMaior=soma;
				maior=i;
			}
			else
				if (soma<somaMenor){
					somaMenor=soma;
					menor=i;
				}
		}
		soma=vs[vs.length-2];
		if (soma>somaMaior){
			somaMaior=soma;
			maior=vs.length-1;
		}
		else
			if (soma<somaMenor){
				somaMenor=soma;
				menor=vs.length-1;
			}
		System.out.println("a soma do maior é "+somaMaior+" na posição "+maior);
		System.out.println("a soma do menor é "+somaMenor+" na posição "+menor);
	}

	public static void main(String[] args) {
		int valores[] = new int[15];
		preenche(valores);
		mostra(valores);
		identificaEEscreveMaiorMenorVizinhanca(valores);

	}
}
