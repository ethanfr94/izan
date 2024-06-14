package ejercicio1;

public class Rectangulo {
	private int largo,ancho;

    public Rectangulo() {
    }

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public double area(){
        double area=ancho*largo;
        return area;
    }
    public double diagonal(){
        double diagonal=Math.sqrt((Math.pow(largo, 2))+(Math.pow(ancho,2)));
        return diagonal;
    }
}
