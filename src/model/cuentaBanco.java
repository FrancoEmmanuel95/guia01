package model;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class cuentaBanco {

    private Integer id;
    private String nombre;
    private Float balance;

    public cuentaBanco(){}
    public cuentaBanco(Integer id,String nombre,Float balance){
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public void setBalance(Float balance){
        this.balance = balance;
    }
    public Float getBalance(){
        return this.balance;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }

    public void credito(Float add){
        this.balance= balance + add;
    }
    public void debito(){
        String debitar;
        //System.out.println("ingrese el mondo a debitar");
        debitar = showInputDialog("ingrese el monto a debitar");
        Float montoDebitado = Float.valueOf(debitar);
        if(montoDebitado >this.balance){
            System.out.println("el debito excede el monto en su cuenta.");
        }
        else {
            this.balance = balance-montoDebitado;
            System.out.println("el debito fue realizado con exito.");
            System.out.println("su nuevo saldo es de: $"+this.balance);
        }
    }
}
