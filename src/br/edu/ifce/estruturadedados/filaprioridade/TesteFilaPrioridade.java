package br.edu.ifce.estruturadedados.filaprioridade;

public class TesteFilaPrioridade {

	public static void main(String[] args) {
		
		TADFilaPrioridade<Integer, String> fila = new FilaPrioridade<Integer, String>();

//		fila.insere(2, "c");	
//		fila.imprime();
//		fila.remove();
//		fila.imprime();
		
//		fila.insere(2, "c");
//		fila.insere(6, "d");
//		fila.insere(7, "a");
//		fila.insere(1, "a");
//		fila.imprime();
		
//		fila.insere(2, "c");
//		fila.insere(6, "d");
//		fila.insere(1, "a");
//		fila.insere(1, "a");
//		fila.imprime();
		
//		fila.insere(5, "c");
//		fila.insere(4, "d");
//		fila.insere(3, "e");
//		fila.insere(2, "a");
//		fila.insere(1, "a");
//		fila.imprime();
		
		fila.remove();
		fila.imprime();
		fila.remove();
		fila.imprime();
		fila.remove();
		fila.imprime();
		fila.remove();
		fila.imprime();
		fila.remove();
		fila.imprime();
//		
//		fila.remove();
		
		
	}
	
}
