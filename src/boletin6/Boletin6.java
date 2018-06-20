/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin6 {

    public static void main(String[] args) {
        Conta cliente1 = new Conta();
        Conta cliente2 = new Conta();
        String nome = JOptionPane.showInputDialog("nome do cliente 1");
        cliente1.setNome(nome);
        String num = JOptionPane.showInputDialog("numero de conta do cliente 1");
        cliente1.setNum(num);

        Double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta do cliente 1"));
        cliente1.setSaldo(saldo);
        Double ing = Double.parseDouble(JOptionPane.showInputDialog("Ingreso no cliente 1?"));
        cliente1.setIngreso(ing);
        Double ret = Double.parseDouble(JOptionPane.showInputDialog("Retirada do cliente 1?"));
        cliente1.setRetirada(ret);
        String nome2 = JOptionPane.showInputDialog("nome do cliente 2");
        cliente2.setNome(nome2);
        String num2 = JOptionPane.showInputDialog("numero de conta do cliente 2");
        cliente2.setNum(num2);

        Double saldo2 = Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta do cliente 2"));
        cliente2.setSaldo(saldo2);
        Double ing2 = Double.parseDouble(JOptionPane.showInputDialog("Ingreso no cliente 2?"));
        cliente2.setIngreso(ing2);
        Double ret2 = Double.parseDouble(JOptionPane.showInputDialog("Retirada do cliente 2?"));
        cliente2.setRetirada(ret2);

        cliente1.amosa();
        cliente1.movimientos();
        cliente2.amosa();
        cliente2.movimientos();
    }

}
