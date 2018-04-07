package hello;

public class Cadeira {
	private String letra;
	private int numero;
	private boolean reservada;
	
	public Cadeira (String letra, int numero, boolean reservada) {
		this.setLetra(letra);
		this.setNumero(numero);
		this.setReservada(reservada);
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isReservada() {
		return reservada;
	}

	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}
}
