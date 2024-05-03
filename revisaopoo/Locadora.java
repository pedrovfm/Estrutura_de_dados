package revisaopoo;

public class Locadora {
	private int indiceD;
	private int indiceF;
	private Disco[] discos;
	private Filme[] filmes;
	
	public Locadora () {
		int indiceD = 0;
		int indiceF = 0;
		discos = new Disco[2];
		filmes = new Filme[2];
	}
	
	public void novoDisco(Disco d) {
		 for (int i=0; i<discos.length; i++) {
			 if (discos[i] == null) {
				 discos[i] = d;
				 break;
			 }
		 }
	}
	
	public void novoFilme(Filme f) {
		for (int i=0; i<filmes.length; i++) {
			 if (filmes[i] == null) {
				 filmes[i] = f;
				 break;
			 }
		 }
	}
	
	public void listarDiscos() {
		while (indiceD < discos.length) {
			if (this.discos[indiceD] != null) {
				this.discos[indiceD].ListaInformacoes();			
			} else {
				System.out.println("* Espaco disponivel, disco nao alocado *");
			}
			indiceD++;
		}
	}
	
	public void listarFilmes() {
		while (indiceF < filmes.length) {
			if (this.filmes[indiceF] != null) {
				this.filmes[indiceF].ListaInformacoes();			
			} else {
				System.out.println("* Espaco disponivel, filme nao alocado *");
			}
			indiceF++;
		}
	}
}