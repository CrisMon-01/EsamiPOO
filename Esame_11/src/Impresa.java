import java.util.*;
public class Impresa extends Societa implements Comparable<Impresa> {
//	private int annoDiCostituzione;
//	private String nazione;
//	private String nome;
//	private Set<Dipendente> dipendenti;
	public Impresa(int annoDiCostituzione, String nazione, String nome) {
		super(annoDiCostituzione, nazione, nome);
	}

	public void aggiungiDipendente(Dipendente dipendente) {
		this.getDipendenti().add(dipendente); }
	public int compareTo(Impresa that) {
		return this.getNome().compareTo(that.getNome());
	}
	@Override
	public int getNumeroDipendenti() {
		// scrivere il codice di questo metodo (vedi DOMANDA 2)
		return this.getDipendenti().size();
	}
} 