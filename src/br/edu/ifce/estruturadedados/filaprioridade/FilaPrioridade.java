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
			No<K, V> noAnterior = cabeca; // N� anterior ao ponto de inser��o
			int posicao = 0; //Posi��o onde o novo n� ser� inserido
			
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
			if(posicao == tamanho) {//noAnterior � igual ao noAuxiliar
				noAnterior.setProximo(novoNo); 
			}
		}
		tamanho++;
	}

	@Override
	public V remove() {
		if(filaVazia()) {//Realizar as valida��es
			System.out.println("Fila Vazia! N�o h� elementos para remo��o!");
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
			System.out.println("Fila vazia! N�o h� elementos pra impress�o.");
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
