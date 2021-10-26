/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula27;

import javax.swing.JOptionPane;

/**
 *
 * @author 20931131
 */
public class Exercicio2 {
    public static void mostrar(int[][][] m) {
        JOptionPane.showMessageDialog(null, reunir(m));
    }
    public static String reunir(int[][][] m) { // Reune os grupos em uma string e retorna
        String resultado = "Grupo 1\n\n";
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m.length;j++) {
                resultado += m[i][j][0] + " ";
                    if(j == m.length-1)
                        resultado += "\n";
            }
        resultado += "\n\n";
        resultado += "Grupo 2\n\n";
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m.length;j++) {
                resultado += m[i][j][1]+" ";
                    if(j == m.length-1)
                        resultado += "\n";
            }
        return resultado;
    }
    public static void gerar(int[][][] m) { // Gera numeros de 0 a 800 aleatorios e os coloca no grupo 0
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m.length;j++)
                    m[i][j][0] = (int)(800*Math.random());
    }
    public static void dividir(int[][][] m, int t) {
        int cx1 = Integer.parseInt(JOptionPane.showInputDialog(reunir(m)+"\n\nCentro 1 x: "));
        int cy1 = Integer.parseInt(JOptionPane.showInputDialog(reunir(m)+"\n\nCentro 1 y: "));
        int cx2 = Integer.parseInt(JOptionPane.showInputDialog(reunir(m)+"\n\nCentro 2 x: "));
        int cy2 = Integer.parseInt(JOptionPane.showInputDialog(reunir(m)+"\n\nCentro 2 y: "));
        // conferir(cx1,cy1)
        // conferir(cx2,cy2)
    }
    public static void main(String[] args) {
        int mundo[][][];
        int tamanho;
        tamanho = Integer.parseInt(JOptionPane.showInputDialog("Tamanho: "));
        mundo = new int[tamanho][tamanho][2];
        gerar(mundo);
        mostrar(mundo);
        dividir(mundo,tamanho);
    }

}
