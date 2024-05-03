package revisaopoo;

public class Filme extends Item {
	private String nomeDir;
	private int duracao;
	private String genero;
	
	public Filme () {
	}
	
	public Filme (String titulo, int anoLanc, String comentario, String nomeDir, int duracao, String genero) {
		this.setTitulo(titulo);
		this.setAnoLanc(anoLanc);
		this.setComentario(comentario);
		this.setNomeDir(nomeDir);
		this.setDuracao(duracao);
		this.setGenero(genero);
	}

	public String getNomeDir() {
		return nomeDir;
	}

	public void setNomeDir(String nomeDir) {
		this.nomeDir = nomeDir;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void ListaInformacoes() {
		System.out.println("Titulo: "+this.getTitulo());
		System.out.println("Ano de Lancamento: "+this.getAnoLanc());
		System.out.println("Comentario: "+this.getComentario());
		System.out.println("Diretor: "+this.getNomeDir());
		System.out.println("Duracao: "+this.getDuracao()+"min.");
		System.out.println("Genero: "+this.getGenero());
		System.out.println("\n");
	}
}
