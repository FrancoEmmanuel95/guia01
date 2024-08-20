package model;

public class empleados {
    private Integer dni;
    private String nombre;
    private String apellido;
    private Float salario;

    public  empleados(){}

    public empleados(Integer dni, String nombre,String apellido,Float salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public void setDni(Integer dni){
        this.dni = dni;
    }
    public Integer getDni(){
        return this.dni;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setSalario(Float salario){
        this.salario = salario;
    }
    public Float getSalario(){
        return this.salario;
    }

    public Float annualSalary(Float salario){
        Float annual;
        annual = salario*12;
        return annual;
    }


}
