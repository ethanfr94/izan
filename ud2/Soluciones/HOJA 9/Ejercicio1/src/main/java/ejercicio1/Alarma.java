package ejercicio1;

enum EstadoTimbre {
	APAGADO, ENCENDIDO
}

public class Alarma {

	private double temperatura;
	private EstadoTimbre timbre;

	public Alarma(double temperatura) {
		this.temperatura = temperatura;
		timbre = EstadoTimbre.APAGADO;
	}

	public boolean comprueba() {

		if ((temperatura < 10) || (temperatura > 35)) {
			timbre = EstadoTimbre.ENCENDIDO;
			return true;
		} else
			return false;
	}

	public void normaliza() {
		temperatura = 25;
		timbre = EstadoTimbre.APAGADO;
	}

	public EstadoTimbre getTimbre() {
		return timbre;
	}
    
}

