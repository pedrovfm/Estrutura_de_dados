package listaencadeada;

import listaduencadeada.IteradorD;
import listaduencadeada.ListaDuEncadeada;

public class ListaEncadeada<T> {
	private int tamanho;
	private Celula primeira, ultima;
	
	public ListaEncadeada () {
		tamanho = 0;
		ultima = primeira = null;
	}
	
	public ListaEncadeada (Celula celula) {
		tamanho = 1;
		ultima = primeira = celula;
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
		if (tamanho < posicao) {
			throw new NullPointerException("Posicao invalida");
		}
		else {
			Celula novaCelula = new Celula (elemento);
			Iterador it = new Iterador(primeira);
			if (tamanho>0) {
				for (int i=0; it.hasNext(); i++) {
					if (i == posicao-1) {
						novaCelula.setProxima(it.getAtual().getProxima());
						it.getAtual().setProxima(novaCelula);					
					}
					it.setAtual(it.getAtual().getProxima());
				}				
			}
			else {
				primeira = ultima = novaCelula;
			}
			tamanho++;	
			ultima = it.getAtual();							
		}
	}
	
	public void adicionaInicio (T elemento) {
		Celula novaCelula = new Celula (elemento);
		if (tamanho>0) {
			novaCelula.setProxima(primeira);
			primeira = novaCelula;			
		}
		else {
			primeira = ultima = novaCelula;
		}
		tamanho++;
	}
	
	public void adicionaFim (T elemento) {
		Celula novaCelula = new Celula(elemento);
		if (tamanho>0) {
			ultima.setProxima(novaCelula);			
			ultima = novaCelula;
		}
		else {
			primeira = ultima = novaCelula;
		}
		tamanho++;
	}
	
	public boolean existeDado (T elemento) {
		if (tamanho == 0) {
			System.out.println("A lista esta vazia");
			return false;
		}
		else {
			Iterador it = new Iterador(primeira);
			
			for (int i=0; it.hasNext(); i++) {
				if (it.getAtual().getElemento().equals(elemento)) {
					return true;
				}
			}
			return false;			
		}
	}
	
	public T recuperar (int posicao) {
		if (tamanho < posicao) {
			throw new NullPointerException("Posicao invalida");
		}
		else {
			Iterador it = new Iterador(primeira);
			for (int i=0; i <= posicao; i++) {
				it.setAtual(it.getAtual().getProxima());
			}
			T elemento = (T) it.getAtual().getElemento();
			return elemento;			
		}
	}
	
	public void remover (int posicao) {
		if (tamanho < posicao) {
			throw new NullPointerException("Posicao invalida");
		}
		else {
			Iterador it = new Iterador(primeira);
			for (int i=0; it.hasNext(); i++) {
				it.setAtual(it.getAtual().getProxima());
				if (i+1 == posicao) {
					Celula proxima2x = it.getAtual().getProxima().getProxima(); //armazenando proxima da celula a ser removida
					it.getAtual().setProxima(proxima2x); //a celula atual passa a apontar pra a proxima da proxima, removendo a que estava no meio	
				}
			}
			ultima = it.getAtual();
			tamanho--;			
		}
	}
	
	public void removerInicio() {
		if (tamanho == 0) {
			System.out.println("A lista esta vazia");
		}
		else {
			primeira = primeira.getProxima();			
		}
	}
	
	public void removerFinal () {
		if (tamanho == 0) {
			System.out.println("A lista esta vazia");
		}
		else {
			Iterador it = new Iterador(primeira);
			for (int i=0; it.getAtual().getProxima() != ultima; i++) {
				it.setAtual(it.getAtual().getProxima());
			}
			it.getAtual().setProxima(null);
			ultima = it.getAtual();
			tamanho--;			
		}
	}
	
	public void limpar () {
		tamanho = 0;
		ultima = primeira = null;
	}
	
	public ListaEncadeada duplaParaSimples(ListaDuEncadeada lista) {
		ListaEncadeada listaNova = new ListaEncadeada();
		IteradorD it = new IteradorD(lista.getPrimeira());
		
		for (int i=0; it.hasNext(); i++) {
			listaNova.adicionaFim(it.getAtual().getElemento());
			it.setAtual(it.getAtual().getProxima());
		}
		return listaNova;
	}
	
	public ListaEncadeada concatenar(ListaEncadeada primeira, ListaEncadeada segunda, int posicao) {
		Iterador it = new Iterador(primeira.getPrimeira());
		for (int i=0; i==posicao-1; i++) {
			it.setAtual(it.getAtual().getProxima());
		}
		segunda.getUltima().setProxima(it.getAtual().getProxima());
		it.getAtual().setProxima(segunda.getPrimeira());
		primeira.setTamanho(primeira.getTamanho()+segunda.getTamanho());
		return primeira;
	}
	
	public ListaEncadeada transformarConcatenar(ListaEncadeada listaS, ListaDuEncadeada listaD, int posicao) {
		return concatenar(listaS, duplaParaSimples(listaD), posicao);
	}
}
