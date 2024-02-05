package ejercicio2;

public class Libro {
	private String ISBN;
    private String titulo;
    private String autor;

    public Libro(String ISBN, String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        if (ISBN.length() == 13) {
            this.ISBN = ISBN;   
        } else {
            System.err.println("Error al crear el objeto");
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    /*
      Un  método  llamado  esEspañol  que  devuelve  verdadero  si  los  caracteres  que 
ocupan las posiciones 4 y 5 del ISBN son “84”. Ejemplo de ISBN=”9788499640884” 
es español.

    */
    public boolean esEspaniol(){
    boolean resul=false;
    String codigo=ISBN.substring(3,5);
       if(codigo.equals("84")){
           resul=true;
       }
    return resul;
    }
    /*
      Un  método  llamado  mostrar  que  muestra  el  título  con  todas  las  letras  en 
mayúsculas y el autor en minúsculas (salvo la primera letra).
    */
    public void mostrar(){
        System.out.println(titulo.toUpperCase()+", "+Character.toUpperCase(autor.charAt(0)) + autor.substring(1).toLowerCase());
    }
}
