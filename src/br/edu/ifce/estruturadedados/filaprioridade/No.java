package br.edu.ifce.estruturadedados.filaprioridade;

public class No<K, V> {

	private K chave;
	private V valor;
	private No<K, V> proximo;

	public No(K chave, V valor, No<K, V> proximo) {
		this.chave = chave;
		this.valor = valor;
		this.proximo = proximo;
	}

	public K getChave() {
		return chave;
	}

	public V getValor() {
		return valor;
	}

	public No<K, V> getProximo() {
		return proximo;
	}

	public void setProximo(No<K, V> proximo) {
		this.proximo = proximo;
	}

}
