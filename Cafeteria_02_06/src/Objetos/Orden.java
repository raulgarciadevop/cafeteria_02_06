package Objetos;

public class Orden {

  private int mesa;

  private int total;

  private int estado;

  private Bebida[] pedidoBebidas;

  private Platillo[] pedidoPlatillo;
  
  public Orden(){
      
  }
  
  public void addOrden(int mesa, Bebida[] bebidas,Platillo[] platillos){
      this.mesa=mesa;
      this.pedidoBebidas=bebidas;
      this.pedidoPlatillo=platillos;
      int totally=0;
      for(int i=0;i<=pedidoBebidas.length;i++){
          totally=totally+pedidoBebidas[i].getPrecio();
      }
      for(int i=0;i<=pedidoPlatillo.length;i++){
          totally=totally+pedidoPlatillo[i].getPrecio();
      }
      this.total=totally;
      this.estado=1;//levantado
      
  }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Bebida[] getPedidoBebidas() {
        return pedidoBebidas;
    }

    public void setPedidoBebidas(Bebida[] pedidoBebidas) {
        this.pedidoBebidas = pedidoBebidas;
    }

    public Platillo[] getPedidoPlatillo() {
        return pedidoPlatillo;
    }

    public void setPedidoPlatillo(Platillo[] pedidoPlatillo) {
        this.pedidoPlatillo = pedidoPlatillo;
    }
  
  

}