package revisaopoo;

public class Main {
	public static void main(String[] args) {
		Disco disco1 = new Disco("Samba Social Clube 5", 2014, "Vários sambas", "Vários artistas", 12, "CD");
		Disco disco2 = new Disco("Pode Entrar", 2009, "Ivete e convidados", "Ivete Sangalo", 14, "DVD");
		
		Filme filme1 = new Filme("Smurfs 2", 2013, "Gargamel cria a versão malvada dos smurfs", "Raja Gosnell", 140, "Animação");
		Filme filme2 = new Filme("Os mercenários 2", 2012, "De volta ao mundo", "Simon West", 210, "Animação");

		Locadora locadora = new Locadora();
		locadora.novoDisco(disco1);
		locadora.novoDisco(disco2);
		locadora.novoFilme(filme1);
		locadora.novoFilme(filme2);
		
		locadora.listarDiscos();
		locadora.listarFilmes();
	}
}
