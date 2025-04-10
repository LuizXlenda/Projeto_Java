package Exercicio_06;

public class Contatos {
	private String nome;
	private String telefone;
	
	Contatos(String nome, String telef){
		this.nome = nome;
		this.telefone = telef;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getTel() {
		return this.telefone;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTel(String tel) {
		this.telefone = tel;
	}
	
	public String toString() {
		return "Nome: " + this.nome + " Telefone: " + this.telefone;
	}
	
	
	
	
	
	
	
	
	
	
}




