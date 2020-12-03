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
}