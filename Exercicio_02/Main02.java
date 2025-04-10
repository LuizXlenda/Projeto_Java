package Exercicio_02;

public class Main02 {

	public static void main(String[] args) {
		Livro[] livros = new Livro[5];
		
		for(int i=0; i<livros.length; i++) {
			String titulo = inputHelper.pegarInput("Digite um titulo: ");
			String autor = inputHelper.pegarInput("Digite o nome do autor: ");
			int ano = inputHelper.inputInt("Digite o ano: ");
			System.out.println();
			
			livros[i] = new Livro(titulo, autor, ano);
		}
		
		for(int i=0; i<livros.length; i++) {
			livros[i].exibirinfo();
		}

	}

}
