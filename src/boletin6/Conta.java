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
public class Conta {

    String nome;
    String num;
    Double saldo;
    Double ing;
    Double ret;
    Double transf1;
    Double transf2;
    

    public Conta() {
    }

    ;   

public Conta(String nome, String num, Double saldo, Double ing, Double ret, Double transf1, Double transf2) {
        this.nome = nome;
        this.num = num;
        this.saldo = saldo;
        this.ing = ing;
        this.ret = ret;
        this.transf1=transf1;
    }

    ;
public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setIngreso(double ing) {
        this.ing = ing;
    }

    public void setRetirada(double ret) {
        this.ret = ret;
    }
public void setTrans1(double transf1){
this.transf1=transf1;}
public void setTrans2(double transf2){
this.transf2=transf2;}
    public void amosa() {
        JOptionPane.showMessageDialog(null," o cliente"+ nome + " con numero de conta: " + num + " ten: " + saldo);
    }

    public void movimientos() {
        if (ing != 0) {
            JOptionPane.showMessageDialog(null, "Ingreso realizado con exito. Saldo actual:" + (ing + saldo));
        }
        else{JOptionPane.showMessageDialog(null,"Sin igreso");}
            if (ret != 0) {if(ret<(saldo+ing)){
                JOptionPane.showMessageDialog(null, "Retirada realizada con exito. Saldo actual: " + (saldo - ret));}
            else{JOptionPane.showMessageDialog(null, "No se pode retirar esa cantidad");}}
                else{JOptionPane.showMessageDialog(null,"Sin retirada");}
            
        

            }}
