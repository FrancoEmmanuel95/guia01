package model;

public class itemVenta {
    private static Integer autoId=0;
    private Integer id;
    private String desc;
    private Integer cant;
    private Double precio;

    public itemVenta(){}
    public itemVenta(String desc, Integer cant, Double precio){
        this.autoId++;
        this.id = autoId;
        this.desc = desc;
        this.cant = cant;
        this.precio = precio;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }
    public void setPrecio(Double precio){
        this.precio = precio;
    }
    public void setCant(Integer cant){
        this.cant = cant;
    }
    public Integer getId(){
        return this.id;
    }
    public String getDesc(){
        return this.desc;
    }
    public Integer getCant(){
        return this.cant;
    }
    public Double getPrecio(){
        return this.precio;
    }

    public Double calcularPrecioTotal(){
        return this.precio * this.cant;
    }

    public void mostrarItem(){
        Double total = calcularPrecioTotal();
        System.out.println("id:"+this.id+", desc:"+this.desc+", cant:"+this.cant+", p.unit:$"+this.precio);
    }


}