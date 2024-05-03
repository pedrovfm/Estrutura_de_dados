package fila;

public class Celula<T> {
	private T elemento;
	private Celula proxima;
	
	
	public Celula (T elemento, Celula proxima) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
	public Celula (T elemento) {
		this.elemento = elemento;
		proxima = null;
	}

	public T getElemento() {
		return elemento;
	}

	public Celula getProxima() {
		return proxima;
	}
	
	public void setProxima (Celula celula) {
		proxima = celula;
	}
}
