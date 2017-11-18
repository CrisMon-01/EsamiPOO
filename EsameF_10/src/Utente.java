public class Utente {
	//non esiste criterio di uguaglianza in utente->sfrutto quello di obj. 2 ogg diversi sono diversi
	private String nome;
	public Utente(String nome) { this.nome = nome; }
	public void setNome(String nome) { this.nome = nome; }
	public String getNome() { return this.nome; }
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Utente that=(Utente)obj;
		return this.getNome().equals(that.getNome());
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getNome().hashCode();
	}
	
} 