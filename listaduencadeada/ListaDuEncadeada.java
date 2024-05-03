package listaduencadeada;

public class ListaDuEncadeada<T> {
	private int tamanho;
	private Celula primeira, ultima;
	
	public ListaDuEncadeada() {
		tamanho = 0;
		primeira = ultima = null;
	}
	
	public ListaDuEncadeada(Celula celula) {
		tamanho = 1;
		primeira = ultima = celula;
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public Celula getPrimeira() {
		return primeira;
	}

	public void setPrimeira(Celula primeira) {
		this.primeira = primeira;
	}

	public Celula getUltima() {
		return ultima;
	}

	public void setUltima(Celula ultima) {
		this.ultima = ultima;
	}

	public void adiciona (T elemento, int posicao) {
		if (tamanho <= posicao || posicao == 0) {
			throw new NullPointerException("Posicao invalida");
		}
		else {
			Celula novaCelula = new Celula(elemento);
			IteradorD it = new IteradorD(primeira);
			if (tamanho>0) {
				for (int i=0; i < posicao; i++) {
					it.setAtual(it.getAtual().getProxima());
				}
				it.getAtual().getProxima().setAnterior(novaCelula);
				it.getAtual().setProxima(novaCelula);
				novaCelula.setProxima(it.getAtual().getProxima());
				novaCelula.setAnterior(it.getAtual());				
			}
			else {
				primeira = ultima = novaCelula;
			}
			tamanho++;
		}
	}
	
	public void adicionaInicio(T elemento) {
		Celula novaCelula = new Celula(elemento);
		if (tamanho>0) {
			novaCelula.setProxima(primeira);
			primeira.setAnterior(novaCelula);
			primeira = novaCelula;			
		}
		else {
			primeira = ultima = novaCelula;
		}
		tamanho++;
	}
	
	public void adicionaFim(T elemento) {
		Celula novaCelula = new Celula(elemento);
		if (tamanho>0) {
			novaCelula.setAnterior(ultima);
			ultima.setProxima(novaCelula);
			ultima = novaCelula;			
		}
		else {
			primeira = ultima = novaCelula;
		}
		tamanho++;
	}
	
	public boolean existeDado(T elemento) {
		if (tamanho == 0) {
			System.out.println("A lista esta vazia");
			return false;
		}
		else {
			IteradorD it = new IteradorD(primeira);
			for (int i=0; i<=tamanho; i++) {
				if (it.getAtual().getElemento().equals(elemento)) {
					return true;
				}
				it.setAtual(it.getAtual().getProxima());
			}
			return false;
		}
	}
	
	public T recuperar(int posicao) {
		if (tamanho < posicao) {
			throw new NullPointerException("Posicao invalida");
		}
		else {
			IteradorD it = new IteradorD(primeira);
			for (int i=0; i>=posicao; i++) {
				it.setAtual(it.getAtual().getProxima());
			}
			T elemento = (T) it.getAtual().getElemento();
			return elemento;
		}
	}
	
	public void remover(int posicao) {
		if (tamanho < posicao) {
			throw new NullPointerException("Posicao invalida");
		}
		else {
			IteradorD it = new IteradorD(primeira);
			for (int i=0; i<=posicao; i++) {
				it.setAtual(it.getAtual().getProxima());
			}
			it.getAtual().getAnterior().setProxima(it.getAtual().getProxima());
			it.getAtual().getProxima().setAnterior(it.getAtual().getAnterior());
			if (it.getAtual().equals(primeira)) {
				primeira = it.getAtual().getProxima();
			}
			else if (it.getAtual().equals(ultima)) {
				ultima = it.getAtual().getAnterior();
			}
			it.setAtual(null);
			tamanho--;
 		}
	}
	
	public void removerInicio() {
		if (tamanho == 0) {
			System.out.println("A lista esta vazia");
		}
		else {
			primeira = primeira.getProxima();
			primeira.setAnterior(null);
			tamanho--;
		}
	}
	
	public void removerFinal() {
		if (tamanho == 0) {
			System.out.println("A lista esta vazia");
		}
		else {
			ultima = ultima.getAnterior();
			ultima.setProxima(null);
			tamanho--;
		}
	}
	
	public void limpar () {
		tamanho = 0;
		primeira = ultima = null;
	}
	
	public ListaDuEncadeada concatenar (int posicao, ListaDuEncadeada lista1, ListaDuEncadeada lista2) {
		IteradorD it = new IteradorD(lista1.getPrimeira());
		for (int i=0; i<posicao; i++) {
			it.setAtual(it.getAtual().getProxima());
		}
		lista2.getPrimeira().setAnterior(it.getAtual());
		lista2.getUltima().setProxima(it.getAtual().getProxima());
		it.getAtual().getProxima().setAnterior(lista2.getUltima());
		it.getAtual().getProxima().setProxima(null);
		it.getAtual().setProxima(lista2.getPrimeira());
		lista1.setTamanho(lista1.getTamanho()+lista2.getTamanho());
		return lista1;
	}
}