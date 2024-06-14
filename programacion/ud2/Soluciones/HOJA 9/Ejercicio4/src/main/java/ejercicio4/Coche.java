package ejercicio4;

public class Coche {
    private Rueda ruedaDI,ruedaDD, ruedaTI, ruedaTD;
    private Motor motor;
    private String modelo;
    private String color;

    public Coche() {
    }

    public Coche(Rueda ruedaDI, Rueda ruedaDD, Rueda ruedaTI, Rueda ruedaTD, Motor motor, String modelo, String color) {
        this.ruedaDI = ruedaDI;
        this.ruedaDD = ruedaDD;
        this.ruedaTI = ruedaTI;
        this.ruedaTD = ruedaTD;
        this.motor = motor;
        this.modelo = modelo;
        this.color = color;
    }

    public Rueda getRuedaDI() {
        return ruedaDI;
    }

    public void setRuedaDI(Rueda ruedaDI) {
        this.ruedaDI = ruedaDI;
    }

    public Rueda getRuedaDD() {
        return ruedaDD;
    }

    public void setRuedaDD(Rueda ruedaDD) {
        this.ruedaDD = ruedaDD;
    }

    public Rueda getRuedaTI() {
        return ruedaTI;
    }

    public void setRuedaTI(Rueda ruedaTI) {
        this.ruedaTI = ruedaTI;
    }

    public Rueda getRuedaTD() {
        return ruedaTD;
    }

    public void setRuedaTD(Rueda ruedaTD) {
        this.ruedaTD = ruedaTD;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String mostrarInformacion() {
   
       
        return ("Ruedas: \n"+"\tRueda delantera izquierda: " + ruedaDI.getMarca() + 
                ", " + ruedaDI.getDiametro() + "\n\tRueda delantera derecha: " + ruedaDD.getMarca() + 
                ", " + ruedaDD.getDiametro()+"\n\tRueda trasera izquierda: " + ruedaTI.getMarca() + 
                ", " + ruedaTI.getDiametro() + "\n\tRueda trasera derecha: " + ruedaTD.getMarca() + 
                ", " + ruedaTD.getDiametro()+"\nMotor: "+"\n\tCilindrada: "+motor.getCilindrada()+
                "\n\tCaballos: "+motor.getCaballos()+"\nModelo: "+modelo+"\nColor: "+color);

        
        
    }

}
