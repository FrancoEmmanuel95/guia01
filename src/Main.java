import model.empleados;
import model.cuentaBanco;
import model.libro;

public class Main {
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


    libro l1 = new libro("El Quijote","Miguel de Cervantes",500.0F,10);
    libro l2 = new libro("Cien Años de Soledad","Gabriel Garcia Marquez",700.00F,5);

    l1.imprimir();
    l2.imprimir();

    l1.venta(3);
    l1.imprimir();
    l2.venta(8);
    l2.reponer(5);
    l2.imprimir();

    }


}