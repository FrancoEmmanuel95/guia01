package model;

public class libro {

    private static Integer idInc = 0;
    private Integer id;
    private String titulo;
    private String autor;
    private Float precio;
    private Integer copias;

    public libro(String titulo,String autor,Float precio,Integer copias){
        this.idInc++;
        this.id = idInc;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.copias = copias;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setPrecio(Float precio){
        this.precio = precio;
    }
    public void setCopias(Integer copias){
        this.copias = copias;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public Float getPrecio(){
        return this.precio;
    }
    public Integer getCopias() {
        return copias;
    }

    public Integer getId(){
        return this.id;
    }

    public void imprimir(){
        System.out.println("id:"+this.id+",titulo:"+this.titulo+", autor:"+this.autor+", precio:"+this.precio+", copias disponibles:"+this.copias);
    }
    public void reponer(Integer num){
        this.copias = this.copias + num;
    }
    public void venta(Integer num){
        if(this.copias<num){
            System.out.println("la venta excede el numero de copias");
        }
        else{
            this.copias = this.copias - num;
            System.out.println("la venta se realizo de manera correcta, quedan "+this.copias+" copias");
        }
    }
}

