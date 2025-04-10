package Exercicio_06;

import java.util.ArrayList;

//import java.util.HashMap;

public class Agenda {
	private ArrayList<Contatos> cont;

    public Agenda() {
        cont = new ArrayList<>();
    }

    public void adcCont(Contatos contato) {
        cont.add(contato);
    }

    public void deleteCont(String nome) {
        cont.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }

    public Contatos buscarCont(String nome) {
        for (Contatos contato : cont) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; 
    }

    public void listConts() {
        for (Contatos contato : cont) {
            System.out.println(contato);
        }
    }
	
	
	
	
}
