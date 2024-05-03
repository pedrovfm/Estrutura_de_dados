package listaduencadeada;
import java.util.Iterator;

public class IteradorD<T> implements Iterator {
	private Celula atual;
	
	public IteradorD (Celula celula) {
		this.atual = celula;
	}
	
	public Celula getAtual() {
		return atual;
	}

	public void setAtual(Celula atual) {
		this.atual = atual;
	}

	public boolean hasNext() {
		if (!atual.getProxima().equals(null)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public T next() {
		T elemento = (T) atual.getProxima().getElemento();
		return elemento;
	}
	
	public T previous() {
		T elemento = (T) atual.getAnterior().getElemento();
		return elemento;
	}
	
}
