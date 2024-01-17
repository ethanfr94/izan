package ejercicio3;

public class Monedero {
	 private double cantidad;

	    public Monedero(double cantidad) {
	        this.cantidad = cantidad;
	    }

	    public double getCantidad() {
	        return cantidad;
	    }
	    public void meterDinero(double cantidad){
	        this.cantidad+=cantidad;
	    }
	    public void sacarDinero(double cantidad){
	        if(this.cantidad>=cantidad)
	            this.cantidad-=cantidad;
	        else
	            System.out.println("no hay suficiente");
	    }
}
