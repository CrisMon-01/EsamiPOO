import java.util.HashSet;
import java.util.Set;

public abstract class Societa {
	private int annoDiCostituzione;
	private String nazione;
	private String nome;
	private Set<Dipendente> dipendenti;
	public Societa(int annoCostituzione, String nazione, String nome) {
		this.annoDiCostituzione = annoCostituzione;
		this.nazione = nazione;
		this.nome = nome;
		this.dipendenti = new HashSet<Dipendente>();
	}
	

	public String getNazione() { return this.nazione; }
	public String getNome() { return this.nome; }
	public int getAnnoCotruzione(){return this.annoDiCostituzione;}

	public Set<Dipendente> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Set<Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}
	public abstract int getNumeroDipendenti();
	
	
}
