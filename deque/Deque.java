package deque;

public class Deque<T> {
	private Celula head;
	private int tamanho;
	
	public Deque () {
		tamanho = 0;
		head = null;
	}
	
	public void InserirInicio (T elemento) {
		if (this.isEmpty()) {
			Celula nova = new Celula (head, elemento, head);
			head.setProxima(nova);
			head.setAnterior(nova);
		}
		else {
			Celula nova = new Celula (head, elemento, head.getProxima());
			head.getProxima().setAnterior(nova);
			head.setProxima(nova);			
		}
	}
	
	public void InserirFim (T elemento) {
		if (this.isEmpty()) {
			Celula nova = new Celula (head, elemento, head);
			head.setProxima(nova);
			head.setAnterior(nova);
		}
		else {
			Celula nova = new Celula (head.getAnterior(), elemento, head);
			head.getAnterior().setProxima(nova);
			head.setAnterior(nova);		
		}
	}
	
	public boolean existeDado (T elemento) {
		if (this.isEmpty()) {
			System.out.println("A estrutura esta vazia");
			return false;
		}
		Iterador it = new Iterador (head.getProxima());
		while (!it.getAtual().getProxima().equals(head)) {
			it.setAtual(it.getAtual().getProxima());
			if (it.getAtual().getElemento().equals(elemento)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty () {
		return tamanho==0;
	}
	
	public T recuperaInicio () {
		if (this.isEmpty()) {
			throw new NullPointerException("A estrutura está vazia.");
		}
		else {
			T elemento = (T) head.getProxima().getElemento();
			return elemento;			
		}
	}
	
	public T recuperaFim () {
		if (this.isEmpty()) {
			throw new NullPointerException("A estrutura está vazia.");
		}
		else {
			T elemento = (T) head.getAnterior().getElemento();
			return elemento;			
		}
	}
	
	public void alterarInicio (T elemento) {
		if (this.isEmpty()) {
			throw new NullPointerException("A estrutura está vazia.");
		}
		else {
			head.getProxima().setElemento(elemento);			
		}
	}
	
	public void alterarFim (T elemento) {
		if (this.isEmpty()) {
			throw new NullPointerException("A estrutura está vazia.");
		}
		else {
			head.getAnterior().setElemento(elemento);			
		}
	}
	
	public void removeInicio () {
		if (this.isEmpty()) {
			throw new NullPointerException("A estrutura está vazia.");
		}
		else {
			head.setProxima(head.getProxima().getProxima());			
		}
	}
	
	public void removeFim () {
		if (this.isEmpty()) {
			throw new NullPointerException("A estrutura está vazia.");
		}
		else {
			head.setAnterior(head.getAnterior().getAnterior());			
		}
	}
	
	public int tamanho () {
		return tamanho;
	}
	
	public void limpar () {
		head.setProxima(null);
		head.setAnterior(null);
		tamanho = 0;
	}
}
