package ejercicio1;

public class Taller {
	private int aceite, ruedas, contadorCambiosTotales, contadorCambiosParciales;

    public Taller(int aceite, int ruedas) {
        this.aceite = aceite*5;
        this.ruedas = ruedas;
        contadorCambiosTotales=0;
        contadorCambiosParciales=0;
    }
    
    public Taller(Taller t) {
    	this.aceite=t.aceite;
    	this.ruedas=t.ruedas;
    	this.contadorCambiosParciales=t.contadorCambiosParciales;
    	this.contadorCambiosTotales=t.contadorCambiosTotales;
    }
    
    public void addAceite(int aceite){
        this.aceite=this.aceite+aceite*5;
    }
    public void addRuedas(int ruedas){
        this.ruedas=this.ruedas+ruedas;
    }
    
    public int getCambioCompletos(){
        int aux=0;
        if(aceite/3<ruedas/4){
            aux=aceite/3;
        }else{
            aux=ruedas/4;
        }
        return aux;
    }
    public int getCambioParcial(){
        int aux=0;
        if(aceite/3<ruedas/2){
            aux=aceite/3;
        }else{
            aux=ruedas/4;
        }
        return aux;
    }
    
    public boolean cambioCompleto(){
        boolean aux=false;
        if(getCambioCompletos()>0){
            ruedas=ruedas-4;
            aceite=aceite-3;
            this.contadorCambiosTotales++;
            aux=true;
        }
        return aux;
    }
    public boolean cambioParcial(){
        boolean aux=false;
        if(getCambioParcial()>0){
            ruedas=ruedas-2;
            aceite=aceite-3;
            this.contadorCambiosParciales++;
            aux=true;
        }
        return aux;
    }

    public int getAceite() {
        return aceite;
    }

    public int getRuedas() {
        return ruedas;
    }

    @Override
    public String toString() {
        double ingresos=contadorCambiosTotales*4*50+contadorCambiosTotales*3*5;
        ingresos=ingresos+contadorCambiosParciales*2*60+contadorCambiosParciales*3*4.5;
        return "TALLER:\n\tEXISTENCIAS:\n\t\tRuedas: "+ruedas+"\n\t\tAceite: "+aceite+"\n\tINGRESOS: Total: "+ingresos+"€";
    }
    
    
}
