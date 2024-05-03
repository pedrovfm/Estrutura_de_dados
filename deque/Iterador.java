package deque;
import java.util.Iterator;


public class Iterador<T> implements Iterator{
	private Celula atual;
	
	public Iterador (Celula celula) {
		atual = celula;
	}
	
	public Celula next () {
		return atual.getProxima();
	}
	
	public boolean hasNext () {
		if (atual.getProxima().getElemento().equals(null)) {
			return false;
		}
		else {
			return true;
		}
	}

	public Celula getAtual() {
		return atual;
	}

	public void setAtual(Celula atual) {
		this.atual = atual;
	}
	
	
}
