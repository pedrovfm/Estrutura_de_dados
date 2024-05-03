package deque;

public class Celula<T> {
	private Celula anterior, proxima;
	private T elemento;
	
	public Celula (T elemento) {
		this.elemento = elemento;
		anterior = proxima = null;
	}
	
	public Celula (Celula anterior, T elemento, Celula proxima) {
		this.anterior = anterior;
		this.elemento = elemento;
		this.proxima = proxima;
	}
	
	public Celula (T elemento, Celula proxima) {
		this.anterior = null;
		this.elemento = elemento;
		this.proxima = proxima;
	}
	
	public Celula (Celula anterior, T elemento) {
		this.anterior = anterior;
		this.elemento = elemento;
		this.proxima = null;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
}
