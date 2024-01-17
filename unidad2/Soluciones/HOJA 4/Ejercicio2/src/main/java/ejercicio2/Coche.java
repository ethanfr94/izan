package ejercicio2;

public class Coche {
	private String matricula;
    private int velocidad;

    public Coche(String matricula, int velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public Coche(String matricula) {
        this.matricula = matricula;
        this.velocidad=0;
    }
    public void acelera(int c){
        velocidad+=c;
        velocidad=velocidad>120?120:velocidad;
        
    }
    public void frenar(int c){
        velocidad-=c;
        velocidad=velocidad<0?0:velocidad;
    }

    
    public String letras(){
        return(matricula.substring(matricula.length()-3));
    }

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", velocidad=" + velocidad + "]";
	}
    
    
}
