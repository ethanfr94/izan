package ejercicio2;

public class Ejercicio2 {
  public static void main(String[] args) {
	  Libro l=new Libro("9788499640884","Crepusculo","Sthephany Meyers");
      if (l.esEspaniol()){
          System.out.println("El libro es español");
      }else{
          System.out.println("El libro no es español");
      }
      l.mostrar();

}
}
