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
public class Mercado {
    Produto[] tabela;
    int total;
    public Mercado(int tamanho){
        total = -1;
        tabela = new Produto[tamanho];
    }
    public void mostrar() {
        String resposta = "___________________Lista de produtos_____________________________\n\n";
        for(int i=0; i<=total; i++) {
            resposta += tabela[i].cod + " " + tabela[i].desc + " " + tabela[i].qtd + " " + tabela[i].preco + "\n";
        }
        JOptionPane.showMessageDialog(null, resposta);
    }
    public void inserir(Produto p) {
        if(total == tabela.length - 1)
            JOptionPane.showMessageDialog(null, "Não deu pra inserir");
        else {
            total++;
            tabela[total] = p;
            JOptionPane.showMessageDialog(null, "Inserção feita");
        }
    }
}
