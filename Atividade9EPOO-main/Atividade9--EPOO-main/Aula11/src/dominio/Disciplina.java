package dominio;
public class Disciplina implements Comparable<Disciplina> {
	private String codigo, descricao;
	public Disciplina(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int compareTo(Disciplina disc) {
			/* if (this.codigo.charAt(0) > disc.codigo.charAt(0))
	return 1;
	else if (this.codigo.charAt(0) < disc.codigo.charAt(0))
	
	return -1;
	
	return 0; */
		return this.codigo.compareTo(disc.codigo);
	}
}