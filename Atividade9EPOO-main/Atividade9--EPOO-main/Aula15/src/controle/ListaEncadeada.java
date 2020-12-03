package controle;
public class ListaEncadeada<T> {
	private No<T> primeiro;
	private No<T> ultimo;
	private int tamanho;
	public ListaEncadeada() {
		this.primeiro = null;
		this.ultimo = null;
	}
	private class No<T> {
		public No<T> anterior = null;
		public No<T> proximo = null;
		public T elemento = null;
	}
	public boolean adicionar(T elemento) {
		if (elemento == null)
			return false;
		No<T> novoNo = new No<T>();
		novoNo.elemento = elemento;
		novoNo.anterior = this.ultimo;
		if (this.ultimo != null)
			this.ultimo.proximo = novoNo;
		else
			this.primeiro = novoNo;
		this.ultimo = novoNo;
		this.tamanho++;
		return true;
	}
	public boolean remover(T elemento) {
		No<T> corrente = this.primeiro;
		while (corrente != null) {
			if (corrente.elemento == elemento) {
				if (corrente.anterior != null)
					corrente.anterior.proximo = corrente.proximo;
				else
					this.primeiro = corrente.proximo;
				if (corrente.proximo != null)
					corrente.proximo.anterior = corrente.anterior;
				else
					this.ultimo = corrente.anterior;
				this.tamanho--;
				return true;
			}
			corrente = corrente.proximo;
		}
		return false;
	}
	public T obter(int posicao) {
		if (posicao >= this.tamanho)
			return null;
		No<T> corrente = this.primeiro;
		for (int i = 0; i < posicao; i++)
			corrente = corrente.proximo;
		return corrente.elemento;
	}
	public int getTamanho() {
		return this.tamanho;
	}
}