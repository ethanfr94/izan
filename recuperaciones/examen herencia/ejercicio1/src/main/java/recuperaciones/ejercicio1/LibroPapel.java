/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;



/**
 *
 * @author DAM122
 */
public class LibroPapel extends Libro implements Comparable<Libro>{
    
    private int nPag;

    public LibroPapel() {
        super();
        nPag = Tec.introEntero("introduce numero de paginas");
    }

    public LibroPapel(int nPag) {
        this.nPag = nPag;
    }

    public LibroPapel(String titulo, String autor, int nPag) {
        super(titulo, autor);
        this.nPag = nPag;
    }

    public int getnPag() {
        return nPag;
    }

    public void setnPag(int nPag) {
        this.nPag = nPag;
    }

    @Override
    public String imprime() {
        return super.imprime() + " -Numero de Paginas: "+nPag+"\n"; 
    }
    
    /* @Override
    public int compareTo(Libro o) {
        LibroPapel l = null;
        if(o instanceof LibroPapel){
            l = (LibroPapel) o;
        }            
      return this.getTitulo().compareTo(l.getTitulo());
    }*/
    
    
    
    
}
