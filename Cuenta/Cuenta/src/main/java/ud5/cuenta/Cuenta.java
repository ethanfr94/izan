/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ud5.cuenta;

/**
 *
 * @author Alvaro
 */
public class Cuenta {

    private String numero;      //número de la cuenta
    private float saldo;        //saldo de la cuenta en €

    public Cuenta(String numCta, float saldoCta) {
        numero = numCta;
        saldo = saldoCta;
    }

    public String getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNumero(String numCta) {
        numero = numCta;
    }

    public void setSaldo(float saldoCta) {
        saldo = saldoCta;
    }

    public void ingresarDinero(float importe) {
        saldo = saldo + importe;
    }

    public void extraerDinero(float importe) {
        if ((saldo - importe) < 0) {
            throw new java.lang.ArithmeticException("Saldo negativo");
        } else {
            saldo = saldo - importe;
        }
    }

    public void monstrarCuenta() {
        System.out.println("Nº de cuenta: " + getNumero());
        System.out.println("Saldo: " + getSaldo() + " €");
    }
}
