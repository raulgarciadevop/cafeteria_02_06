package Objetos;

public class Menu {

    private Platillo[] listaPlatillos;
    private Bebida[] listaBebidas;

    private String fecha;

    private int precio;

    public Menu() {

    }

    public Menu(Platillo[] platillos, Bebida[] bebidas) {
        this.listaPlatillos=platillos;
        this.listaBebidas=bebidas;
        this.fecha="15/11/2017";
        
    }

    public void ordenar() {
    }

    public Platillo[] getListaPlatillos() {
        return listaPlatillos;
    }

    public void setListaPlatillos(Platillo[] listaPlatillos) {
        this.listaPlatillos = listaPlatillos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    

}