package ejercicio3;

public class Satelite {
	int meridiano;
    int paralelo;
    int distancia;

    public Satelite() {
        meridiano=0;
        paralelo=0;
        distancia=0;
    }

    public Satelite(int meridiano, int paralelo, int distancia) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distancia = distancia;
    }
    
    public void printPosicion(){
        System.out.println("Meridiano: "+meridiano+" Paralelo: "+paralelo);
    }
    public void variarAltura(int desplazamiento){
        distancia=distancia+desplazamiento;
    }
    public void variarPosicion(int m,int p){
    meridiano=m;
    paralelo=p;
    }

    public boolean enOrbita() {
    	return distancia>=16000?true:false;
    }
}
