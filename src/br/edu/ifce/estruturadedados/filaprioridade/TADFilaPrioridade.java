package br.edu.ifce.estruturadedados.filaprioridade;

public interface TADFilaPrioridade<K,V> {

	//Operações principais
	public void insere(K chave, V valor);
	public V remove();
	
	//Operações secundárias
	public boolean filaVazia();
	public void imprime();
	
}
