package br.edu.ifce.estruturadedados.filaprioridade;

public interface TADFilaPrioridade<K,V> {

	//Opera��es principais
	public void insere(K chave, V valor);
	public V remove();
	
	//Opera��es secund�rias
	public boolean filaVazia();
	public void imprime();
	
}
