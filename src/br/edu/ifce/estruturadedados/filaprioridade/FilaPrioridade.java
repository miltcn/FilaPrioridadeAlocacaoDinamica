package br.edu.ifce.estruturadedados.filaprioridade;

public class FilaPrioridade<K, V> implements TADFilaPrioridade<K, V> {

	private No<K, V> cabeca;
	private int tamanho;

	@Override
	public void insere(K chave, V valor) {

		No<K, V> novoNo = new No<K, V>(chave, valor, null);

		if (filaVazia()) { // novoNo igual a cabeca se a fila estiver vazia
			cabeca = novoNo;
		} else { 
			@SuppressWarnings("unchecked")
			Comparable<K> key = (Comparable<K>) chave; 

			No<K, V> noAuxiliar = cabeca;
			No<K, V> noAnterior = cabeca; // Nó anterior ao ponto de inserção
			int posicao = 0; //Posição onde o novo nó será inserido
			
			while(noAuxiliar != null) {
				if(key.compareTo(noAuxiliar.getChave()) < 0) {
					novoNo.setProximo(noAuxiliar);
					if(posicao == 0) {
						cabeca = novoNo;
					}else {
						noAnterior.setProximo(novoNo);
					}
					break;
				}
				noAnterior = noAuxiliar;
				noAuxiliar = noAuxiliar.getProximo();
				posicao++;
			}
			if(posicao == tamanho) {//noAnterior é igual ao noAuxiliar
				noAnterior.setProximo(novoNo); 
			}
		}
		tamanho++;
	}

	@Override
	public V remove() {
		if(filaVazia()) {//Realizar as validações
			System.out.println("Fila Vazia! Não há elementos para remoção!");
			return null;
		}
		
		No<K,V> noRemovido = cabeca;
		cabeca = cabeca.getProximo();
		noRemovido.setProximo(null);

		tamanho--;

		return noRemovido.getValor();
	}

	@Override
	public boolean filaVazia() {
		return tamanho == 0 ? true : false;
	}

	@Override
	public void imprime() {
		if (filaVazia()) {
			System.out.println("Fila vazia! Não há elementos pra impressão.");
			return;
		}

		No<K, V> auxiliar = cabeca;
		while(auxiliar != null) {
			System.out.print(" => (" + auxiliar.getChave() + ", " + auxiliar.getValor() + ")");
			auxiliar = auxiliar.getProximo();
		}
		System.out.println();

	}

}
