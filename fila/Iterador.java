package fila;
import java.util.Iterator;

public class Iterador<T> implements Iterator {
	private Celula atual;
	
	public Iterador (Celula celula) {
		atual = celula;
	}
	
	public Celula getAtual() {
		return atual;
	}
	
	public void setAtual(Celula celula) {
		atual = celula;
	}
	
	public Celula next() {
		return atual.getProxima();
	}

	public boolean hasNext() {
		return !atual.getProxima().equals(null);
	}
}
