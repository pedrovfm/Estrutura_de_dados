package vetor;

public class Musica {
    private String nome;
    private String artista;
    private int duracao;

    public Musica(){
        this.nome =" ";
        this.artista =" ";
        this.duracao = 0;
    }

    public Musica(String nome, String artista, int duracao){
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    public String getArtista(){
        return this.artista;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public int getDuracao(){
        return this.duracao;
    }    
}