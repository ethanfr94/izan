package ejercicio1;

public class Restaurante {
	 private int huevos;
	    private double chorizo;

	    public Restaurante(int docenas, double chorizo) {
	        this.huevos = docenas*12;
	        this.chorizo = chorizo;  
	    }  
	    public void addHuevos(int docenas){
	        this.huevos=this.huevos+docenas*12;
	    }
	    public void addChorizo(double chorizo){
	        this.chorizo=this.chorizo+chorizo;
	    }
	    public int getNumPlatos(){
	        int platos;
	        if(huevos/2<(int)chorizo/0.2){
	            platos=huevos/2;
	        }else{
	            platos=(int)(chorizo/0.2);
	           
	        }
	        return platos;
	    }
	    public boolean sirvePlato(){
	        boolean aux=false;
	        if(huevos>=2&&chorizo>=0.2){
	            huevos=huevos-2;
	            chorizo=chorizo-0.2;
	            aux=true;
	        }
	        return aux;
	    }
	    public int getHuevos(){
	        return huevos;
	    }
	    public double getChorizo(){
	        return chorizo;
	    }
}
