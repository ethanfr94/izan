package ejercicio3;

enum TipoEstado{HABILITADA,BLOQUEADA}
public class Tarjeta {
    
    private String titular;
    private String cuenta;
    private String pin;
    private TipoEstado estado;
    private double saldo;
/*Construir  un  constructor  que  reciba  como  parámetro  el  nombre,  el  número  de 
cuenta y el saldo disponible y establezca un PIN aleatorio y hace que la tarjeta esté 
bloqueada*/

    public Tarjeta(String titular, String cuenta, double saldo) {
        this.titular = titular;
        this.cuenta = cuenta;
        this.saldo = saldo;
        
        estado=TipoEstado.BLOQUEADA;
        pin=String.valueOf((int) Math.floor(Math.random()*(9999-1000+1))+1000);
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getPIN() {
        return pin;
    }

    public void setPIN(String PIN) {
        this.pin = PIN;
    }

    public TipoEstado isEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /*
  Un método llamado desbloquea que reciba como parámetro el Pin del usuario y si 
es cierto desbloque la tarjeta.*/
    public void desbloquea(String pin){
    if (this.pin.equals(pin)){
    estado=TipoEstado.HABILITADA;
        System.out.println("Desbloqueado");
    }else System.out.println("Pin incorrecto, tarjeta bloqueada");
    
    
    }
    /*
  Crear  un  método  pagar  que  reciba  como  parámetro  el  importe  de  la  compra,  el 
PIN, una descripción de la compra y si incluye propina o no. Verificar y calcular lo 
siguiente:
o  Que la tarjeta esté habilitada, en caso contrario imprima una advertencia.
o  Que el PIN sea correcto...
o  Que exista saldo suficiente para realizar la compra
o  Si se incluye propina, aplicar un recargo del 5% más a la compra.
o  Si  todas  estas  verificaciones  son  correctas,  modificar  los  atributos  que  sean 
necesarios al realizar el pago.
o  */
    public void pagar(double importe, String pin, String descripcion, boolean propina) {
        double propi=0;
        if (estado.compareTo(TipoEstado.HABILITADA) == 0) {
            if(pin.equals(this.pin)){
                if (propina==true){
                propi=importe*0.05;
                }
                if(saldo>=importe+propi){
                    saldo=saldo-importe+propi;
                    System.out.println("He restado el importe");
                    imprimirTicket(descripcion,importe,propi);
                }else{
                    System.out.println("No hay saldo suficiente para pagar el importe");
                }
            }else{
                System.out.println("Pin no es correcto");
            }

        } else {
            System.out.println("Tarjeta deshabilitada");
        }

}
    /*Por  último  imprimir  por  pantalla  el  ticket  de  la  compra  indicando  el  nombre 
del titular, el número de cuenta solo los 4 primeros caracteres visibles  el resto 
con ‘*’, la descripción de la compra (solo 8 caracteres), el valor de la compra, 
los cargos (en caso que haya propina) y el total cargado a la tarjeta.*/
    private void imprimirTicket(String descripcion, double importe,double propi){
        System.out.println("Nombre del titular: " + titular);
        System.out.print("Numero de la cuenta: " + cuenta.substring(0, 4));
        for (int i = 4; i < cuenta.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
        if (descripcion.length() < 8) {
            System.out.println("Descripcion: " + descripcion);
        } else {
            System.out.println("Descripción: " + descripcion.substring(0, 8));
        }
        System.out.println("Importe: " + importe);
        if (propi > 0) {
            System.out.println("Propina: " + propi);
        }
        System.out.println("Total cargado a la tarjeta: " + (importe + propi));

        
    }
}
