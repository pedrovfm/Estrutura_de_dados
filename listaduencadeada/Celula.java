package listaduencadeada;

public class Celula<T> {
	private T elemento;
	private Celula anterior;
	private Celula proxima;
	
	public Celula (T elemento) {
		this.elemento = elemento;
		anterior = proxima = null;
	}
	
	public Celula (T elemento, Celula proxima) {
		this.elemento = elemento;
		anterior = null;
		this.proxima = proxima;
	}
	
	public Celula (Celula anterior, T elemento) {
		this.anterior = anterior;
		this.elemento = elemento;
		proxima = null;
	}
	
	public Celula (Celula anterior, T elemento, Celula proxima) {
		this.anterior = anterior;
		this.elemento = elemento;
		this.proxima = proxima;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
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
}
