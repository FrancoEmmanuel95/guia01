import model.empleados;
import model.cuentaBanco;
import model.libro;
import model.itemVenta;

import javax.swing.*;
import java.util.*;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

/*
        empleados e1 = new empleados(23456345,"Carlos","Gutierrez", 25000.00F);
        empleados e2 = new empleados(34234123,"Ana","Sanchez",27500.00F);

        System.out.println("Empleado: "+e1.getNombre()+" "+e1.getApellido());
        System.out.println("DNI: "+e1.getDni());
        System.out.println("salario mensual: $"+e1.getSalario()+"\nSalario anual: $"+e1.annualSalary(e1.getSalario()));
        System.out.println("\nEmpleado: "+e2.getNombre()+" "+e2.getApellido());
        System.out.println("DNI: "+e2.getDni());
        System.out.println("salario mensual: $"+e2.getSalario()+"\nSalario anual: $"+e2.annualSalary(e2.getSalario()));

        System.out.println("\nincremento del 15% para el empleado DNI: 23456345.");
        Float newSalary = e1.getSalario();
        newSalary = newSalary * 1.15F;
        e1.setSalario(newSalary);
        System.out.println("\nEmpleado: "+e1.getNombre()+" "+e1.getApellido());
        System.out.println("DNI: "+e1.getDni());
        System.out.println("salario mensual: $"+e1.getSalario()+"\nSalario anual: $"+e1.annualSalary(e1.getSalario()));
*/
       /* cuentaBanco c1 = new cuentaBanco(1,"Maria Perez",15000.00F);
        System.out.println("cuenta nro: "+c1.getId()+"\nCliente: "+c1.getNombre()+"\nBalance: $"+ c1.getBalance());

        Float add = 1500.00F;
        c1.credito(add);
        System.out.println("\ncuenta nro: "+c1.getId()+"\nCliente: "+c1.getNombre()+"\nBalance: $"+ c1.getBalance());

        c1.debito();
        c1.debito();*/
/*

    libro l1 = new libro("El Quijote","Miguel de Cervantes",500.0F,10);
    libro l2 = new libro("Cien Años de Soledad","Gabriel Garcia Marquez",700.00F,5);

    l1.imprimir();
    l2.imprimir();

    l1.venta(3);
    l1.imprimir();
    l2.venta(8);
    l2.reponer(5);
    l2.imprimir();
*/
        //itemVenta i1 = new itemVenta("papa",10, (double) 20.32);
        itemVenta i1 = new itemVenta();
        int salida= 1;
        System.out.println("ingrese una opcion.\n 1) agregar un articulo.\n 2) mostrar el producto.\n 3) cambiar la cantidad del articulo.\n 4) cambiar el precio del articulo.\n 5) calcular precio total\n 6) salir.");
     //   salida=scan.nextInt();
        salida=Integer.valueOf(JOptionPane.showInputDialog());
        while(salida>0){
            switch (salida){
                case 1:

                    System.out.println("ingrese el nombre del articulo: ");
                    String producto = scan.nextLine();
                    i1.setDesc(producto);
                    System.out.printf("ingrese la el precio: ");
                    Double precioart=scan.nextDouble();
                    i1.setPrecio(precioart);
                    System.out.println("ingrese la cantidad");
                    Integer cantidad=scan.nextInt();
                    i1.setCant(cantidad);
                case 2:
                    i1.mostrarItem();
                case 3:
                    System.out.printf("\ningrese la nueva cantidad: ");
                    cantidad= scan.nextInt();
                    i1.setCant(cantidad);
                case 4:
                    System.out.printf("ingrese el nuevo precio: ");
                    precioart= scan.nextDouble();
                    i1.setPrecio(Double.valueOf(precioart));
                case 5:
                    Double precioTotal;
                    precioTotal=i1.calcularPrecioTotal();
                    System.out.println("el total es de: $"+precioTotal);
                case 6:
                    salida=0;
            }


        }




    }


}