package revisaopoo;

public abstract class Item {
	private String titulo;
	private int anoLanc;
	private String comentario;
	
	public Item () {
	}
	
	public Item (String titulo, int anoLanc, String comentario) {
		this.setTitulo(titulo);
		this.setAnoLanc(anoLanc);
		this.setComentario(comentario);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoLanc() {
		return anoLanc;
	}

	public void setAnoLanc(int anoLanc) {
		this.anoLanc = anoLanc;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public abstract void ListaInformacoes();
}
