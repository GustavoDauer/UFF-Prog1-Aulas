/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula34;

import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Dauer
 */
public class DemoMercado {
    public static char menu() {
        return JOptionPane.showInputDialog("_____________Menu______________________\n (c) Construir\n (m) Mostrar \n (i) Inserir \n (s) Sair \n").charAt(0);
    }
    public static void main(String args[]) {
        Mercado arariboia = new Mercado(5);
        char opcao;
        do {
            opcao = menu();
            switch(opcao) {
                case 'c': arariboia = new Mercado(Integer.parseInt(JOptionPane.showInputDialog("Tamanho")));
                break;
                case 'm' : arariboia.mostrar();
                break;
                case 'i' :
                    int c = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
                    String d = JOptionPane.showInputDialog("Descricao: ");
                    int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
                    double p = Double.parseDouble(JOptionPane.showInputDialog("Preco: "));
                    arariboia.inserir(new Produto(c, d, qtd, p));
                    break;
            }
        }
        while(opcao!='s');
        arariboia.mostrar();
    }
}
