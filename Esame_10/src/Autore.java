public class Autore {
	private int annoNascita;
	private String nome;
	public Autore(String nome, int annoNascita) {
		this.nome = nome;
		this.annoNascita = annoNascita;
	}
	public String getNome() {
		return this.nome;
	}
	public int getAnnoNascita() {
		return this.annoNascita;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Autore that=(Autore) obj;
		return this.getAnnoNascita()==that.getAnnoNascita() && this.getNome().equals(that.getNome());
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getNome().length()+ this.getAnnoNascita();
	}
	
}