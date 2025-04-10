package Exercicio_02;

public class Livro {
	private String titulo;
	private String autor;
	private int ano;

	Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}

	void exibirinfo() {
		System.out.printf("Título: %s%n", this.titulo);
		System.out.printf("Autor: %s%n", this.autor);
		System.out.printf("Ano: %d%n", this.ano);
		System.out.println();
	}
}
