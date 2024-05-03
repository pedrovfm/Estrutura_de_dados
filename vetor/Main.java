package vetor;

public class Main
{
	public static void main(String[] args) {
		
		/*Instanciando a classe genérica Vetor e nesse momento informando
		que ela é do tipo Aluno*/
		Vetor<Aluno> vetor = new Vetor<Aluno>(3);
		
		//Instanciando um aluno
		Aluno a1  = new Aluno("ANA",  30);
		Aluno a2  = new Aluno("JOSÉ", 33);
		Aluno a3  = new Aluno("JOÃO", 35);
		
		//Adicionando o aluno no vetor
		vetor.addFim(a1);
		vetor.addFim(a2);

		
		vetor.removeFim();
		vetor.removeFim();
		
		/*Instanciando a classe genérica Vetor e nesse momento informando
		que ela é do tipo Musica*/
		Vetor<Musica> vetor2 = new Vetor<Musica>(2);
		
		//Instanciando uma musica
		Musica m1  = new Musica("DESAFINADO", "JOÃO GILBERTO", 4);
		Musica m2  = new Musica("SOZINHO", "PENINHA", 5);
		
		//Adicionando a música no vetor
		vetor2.addInicio(m1);
		vetor2.add(m2, 1);		
		
		//imprimindo os dados do aluno
		System.out.println("Nome: "  + vetor.getEle(0).getNome());
		System.out.println("Idade: " + vetor.getEle(0).getIdade());
		
		//System.out.println("Nome: "  + vetor.Recuperar(1).getNome());
		//System.out.println("Idade: " + vetor.Recuperar(1).getIdade());
		
		//System.out.println("Nome: "  + vetor.Recuperar(2).getNome());
		//System.out.println("Idade: " + vetor.Recuperar(2).getIdade());
		
		System.out.println();
		
		//imprimindo os dados da música
		System.out.println("Nome: "    + vetor2.getEle(0).getNome());
		System.out.println("Artista: " + vetor2.getEle(0).getArtista());
		System.out.println("Duracao: " + vetor2.getEle(0).getDuracao());
		
		System.out.println("Nome: "    + vetor2.getEle(1).getNome());
		System.out.println("Artista: " + vetor2.getEle(1).getArtista());
		System.out.println("Duracao: " + vetor2.getEle(1).getDuracao());
		
	}
}