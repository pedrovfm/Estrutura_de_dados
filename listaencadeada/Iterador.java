package listaencadeada;
import java.util.Iterator;

public class Iterador<T> implements Iterator{
	private Celula atual;
	
	public Iterador (Celula atual) {
		this.atual = atual;
	}

	public Celula getAtual() {
		return atual;
	}
	
	public void setAtual(Celula celula) {
		atual = celula;
	}
	
	@Override
	public boolean hasNext() {
		if (atual != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public T next () {
		T elemento = (T) atual.getProxima().getElemento();
		return elemento;
	}
}
