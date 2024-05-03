package fila;

public class Fila<T> {
	private Celula primeira, ultima;
	private int tamanho;
	
	public Fila() {
		primeira = ultima = null;
		tamanho = 0;
	}
	
	public void Inserir(T elemento) {
		Celula nova = new Celula (elemento);
		if (this.isEmpty()) {
			primeira = ultima = nova;
		}
		else {
			nova.setProxima(ultima);
			ultima = nova;			
		}
		tamanho++;
	}
	
	public boolean existeDado(T elemento) {
		if (this.isEmpty()) {
			throw new NullPointerException("A fila está vazia. Insira elementos antes de realizar a operação.");
		}
		else {
			return elemento.equals(primeira.getElemento());			
		}
	}
	
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	public T Recuperar() {
		T elemento = (T) primeira.getElemento();
		if (this.isEmpty()) {
			throw new NullPointerException("A fila está vazia. Insira elementos antes de realizar a operação.");
		}
		else {
			return elemento;			
		}
	}
	
	public void Alterar(T elemento) {
		if (this.isEmpty()) {
			throw new NullPointerException("A fila está vazia. Insira elementos antes de realizar a operação.");
		}
		else {
			Celula nova = new Celula (elemento, primeira.getProxima());
			primeira = nova;
		}
	}
	
	public void Remover() {
		if (this.isEmpty()) {
			throw new NullPointerException("Não foi possível remover, a fila já está vazia.");
		}
		else {
			Iterador it = new Iterador (primeira);
			for (int i=0; i<tamanho-1; i++) {
				it.setAtual(it.getAtual().getProxima());
			}
			it.getAtual().setProxima(null);			
		}
	}
	
	public int Tamanho() {
		return tamanho;
	}
	
	public void Limpar() {
		primeira = ultima = null;
		tamanho = 0;
	}
}
