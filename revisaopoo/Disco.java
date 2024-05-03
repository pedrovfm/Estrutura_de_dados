package revisaopoo;

public class Disco extends Item {
	private String artista;
	private int qtdFaixas;
	private String midia;
	
	public Disco() {
	}
	
	public Disco (String titulo, int anoLanc, String comentario, String artista, int qtdFaixas, String midia) {
		this.setTitulo(titulo);
		this.setAnoLanc(anoLanc);
		this.setComentario(comentario);
		this.setArtista(artista);
		this.setQtdFaixas(qtdFaixas);
		this.setMidia(midia);
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getQtdFaixas() {
		return qtdFaixas;
	}

	public void setQtdFaixas(int qtdFaixas) {
		this.qtdFaixas = qtdFaixas;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}
	
	public void ListaInformacoes() {
		System.out.println("Titulo: "+this.getTitulo());
		System.out.println("Ano de Lancamento: "+this.getAnoLanc());
		System.out.println("Comentario: "+this.getComentario());
		System.out.println("Artista: "+this.getArtista());
		System.out.println("Quantidade de faixas: "+this.getQtdFaixas());
		System.out.println("Midia: "+this.getMidia());
		System.out.println("\n");
	}
}
