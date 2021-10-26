/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula16;

/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void preenche(double ms[][]) {
		for (int lin = 0; lin < ms.length; lin++)
			for (int col = 0; col < ms[lin].length; col++)
				ms[lin][col] = Integer.parseInt(JOptionPane
						.showInputDialog("Celula[" + lin + "][" + col + "]"));

	}
	public static double calculaMedia (double vs[][]){
		double soma = 0;
		for (int lin = 0; lin < vs.length; lin++)
			for (int col = 0; col < vs[lin].length; col++)
				soma = soma + vs[lin][col];
		return soma/(vs.length*vs[0].length);
	}
	public static double achaMaior(double vs[][]){
		double m = vs[0][0];
		for (int lin = 0; lin < vs.length; lin++)
			for (int col = 0; col < vs[lin].length; col++)
				if(vs[lin][col]>m )
					m = vs[lin][col];
		return m;
	}
	public static double achaMenor(double vs[][]){
		double m = vs[0][0];
		for (int lin = 0; lin < vs.length; lin++)
			for (int col = 0; col < vs[lin].length; col++)
				if(vs[lin][col]<m )
					m = vs[lin][col];
		return m;
	}
	public static void modifica(double vs[][], double m,double x,double y){
		for (int lin = 0; lin < vs.length; lin++)
			for (int col = 0; col < vs[lin].length; col++)
				if(vs[lin][col]>m)
					vs[lin][col]= x;
				else
					if (vs[lin][col]<m)
						vs[lin][col]= y;
	}
	public static void mostraMatriz(double ms[][]) {
		String resp = "";
		for (int lin = 0; lin < ms.length; lin++) {
			for (int col = 0; col < ms[lin].length; col++)
				resp = resp + ms[lin][col] + "   ";
			resp = resp + "\n";
		}
		JOptionPane.showMessageDialog(null, resp);
	}

	public static void main(String[] args) {
		double valores[][];
		int dimensao;
		dimensao = Integer.parseInt(JOptionPane
				.showInputDialog("Diga a dimensão da matriz quadrada: "));
		valores = new double[dimensao][dimensao];
		preenche(valores);
		mostraMatriz(valores);
		double media = calculaMedia(valores);
		double maior = achaMaior(valores);
		double menor = achaMenor(valores);
		modifica(valores, media, maior, menor);
		mostraMatriz(valores);
	}


}
