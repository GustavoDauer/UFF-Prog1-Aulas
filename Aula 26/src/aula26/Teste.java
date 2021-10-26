/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula26;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Pimenta
 */
public class Teste {
    public static void geraMatriz(int[][] vs)
    {
        for (int lin = 0; lin < vs.length; lin++)
        {
            for (int col = 0; col < vs[lin].length; col++)
            {
                vs[lin][col] = 0 + (int)(Math.random()*101);
            }
        }
    }
    public static void mostra (int[][] ms)
    {
        String resp = "";
        for (int lin = 0; lin < ms.length;lin++)
        {
            for (int col = 0; col < ms[lin].length; col++)
            {
                resp += " " + ms[lin][col];
            }
            resp += "\n";
        }
        JOptionPane.showMessageDialog(null, resp);
    }
    public static int [][] multiplica(int [][] xs, int[][] ys, int [][]zs)
    {
        if (xs[0].length != ys.length)
        {
            String resp = "Não é possível multiplicar essas matrizes!";
            JOptionPane.showMessageDialog(null,resp);
        }
        else
        {
        zs = new int [xs.length][ys[0].length];
        for (int lin = 0; lin < zs.length; lin++)
        {
            for (int col = 0; col < zs[lin].length; col++)
            {
                for (int i=0; i < zs[lin][col] ; i++)
                {
                    zs[lin][col] = zs[lin][col] + (xs[lin][i]*ys[i][col]);
                }
            }
        }

        }
        return zs;
    }
    public static void main(String[] args)
    {
        int linhasA = Integer.parseInt(JOptionPane.showInputDialog("Número de linhas matriz A:"));
        int colunasA = Integer.parseInt(JOptionPane.showInputDialog("Número de colunas matriz A:"));
        int linhasB = Integer.parseInt(JOptionPane.showInputDialog("Número de linhas matriz B:"));
        int colunasB = Integer.parseInt(JOptionPane.showInputDialog("Número de colunas matriz B:"));
        int [][] matrizA = new int[linhasA][colunasA];
        int [][] matrizB = new int[linhasB][colunasB];
        geraMatriz(matrizA);
        geraMatriz(matrizB);
        mostra (matrizA);
        mostra (matrizB);
        int [][] matrizC = null;
        multiplica(matrizA,matrizB,matrizC);
        mostra(matrizC);
    }

}
