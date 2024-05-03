package vetor;
import java.util.*;

public class Vetor<T> {
	private T[]vetor;
	private int qtdEle;
	private int tam;
	
	public Vetor (int tam) {
		vetor = (T[]) new Object[tam];
		this.qtdEle = 0;
		this.tam = tam;
	}
	
	public void add (T ele, int pos) {
		if (this.qtdEle == this.tam) {
			this.redimensionar();
		}
		this.vetor[pos] = ele;
		this.qtdEle++;
	}
	
	public void addInicio (T ele) {
		if (this.qtdEle == this.tam) {
			this.redimensionar();
		}
		this.vetor[0] = ele;
		this.qtdEle++;
	}
	
	public void addFim (T ele) {
		if (this.qtdEle == this.tam) {
			this.redimensionar();
		}
		this.vetor[qtdEle] = ele;
		this.qtdEle++;
	}
	
	public boolean existeDado (int pos) {
		return this.vetor[pos] != null;
	}
	
	public T getEle (int pos) {
		if (this.existeDado(pos) && !this.estaVazio()) {
			return this.vetor[pos];
		}
		else {
			throw new ArrayIndexOutOfBoundsException("Posicao Invalida");
		}
	}
	
	public boolean estaVazio () {
		return this.qtdEle == 0;
	}
	
	public void remove (int pos) {
		if (this.existeDado(pos) && !this.estaVazio()) {
			this.vetor[pos] = null;
			this.qtdEle--;
		}
		else {
			throw new ArrayIndexOutOfBoundsException("Posicao Invalida");
		}	
	}
	
	public void removeInicio () {
		if (this.existeDado(0) && !this.estaVazio()) {
			this.vetor[0] = null;
			this.qtdEle--;
		} 
		else {
			System.out.println("Nao ha dado na posicao");
		}	
	}
	
	public void removeFim () {
		if (this.existeDado(qtdEle) && !this.estaVazio()) {
			this.vetor[this.qtdEle] = null;
			this.qtdEle--;			
		}
	}
	
	public boolean buscarEle(T ele) {
		Iterador it = new Iterador(this.vetor);
		int i=0;
		while (it.hasNext()) {
			if (this.vetor[i].equals(ele)) {
				return true;
			}
			i++;
		}
		return false;
	}
	
	public int getTamanho () {
		return this.qtdEle;
	}
	
	public void limpar () {
		Iterador it = new Iterador(this.vetor);
	    int i = 0;
		while (it.hasNext()) {
			this.vetor[i] = null;
			i++;
		}
	}
	
	public void redimensionar () {
		Iterador it = new Iterador(this.vetor);
	    int i = 0;
		if (this.qtdEle == this.tam) {
			T[] vetorDobrado = (T[]) new Object[this.tam*2];
			while (it.hasNext()) {
				vetorDobrado[i] = this.vetor[i];
				i++;
			}
			this.vetor = vetorDobrado;
		}
	}
}