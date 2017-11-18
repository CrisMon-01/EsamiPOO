import java.util.*;
public class Consorzio extends Societa implements Comparable<Consorzio> {
	//	private int annoDiCostituzione;
	//	private String nazione;
	//	private String nome;
	//	private Set<Dipendente> dipendenti;
	private Map<String, Impresa> imprese;
	public Consorzio(int annoCostituzione, String nazione, String nome) {
		super(annoCostituzione, nazione, nome);
		this.imprese = new HashMap<String, Impresa>();
	}
	public int getAnnoDiCostituzione(){ return this.getAnnoDiCostituzione();}

	public void aggiungiConsorziata(Impresa impresa) {	
		/* scrivere il codice di questo metodo (vedi DOMANDA 1) */ 
		imprese.put(impresa.getNome(), impresa);
	}

	public void aggiungiDipendente(Dipendente dipendente) {
		this.getDipendenti().add(dipendente); }
	@Override
	public int getNumeroDipendenti () {
		// scrivere il codice di questo metodo (vedi DOMANDA 2)
		Integer i = 0;
		for(Impresa corrente : imprese.values()){
			i+= corrente.getNumeroDipendenti();
		}
		return i;
	}

	Map<String , List<Societa>> nazione2consorziate(){
		Map<String , List<Societa>> nazione2consorziate = new TreeMap<>();
		for(Impresa corrente : imprese.values()){
			if(nazione2consorziate.containsKey(corrente.getNazione())){
				nazione2consorziate.get(corrente.getNazione()).add(corrente);
				Collections.sort(nazione2consorziate.get(corrente.getNazione()), new ComparatoreAnno());
			}
			else{ List<Societa> nuova = new ArrayList<>();
				nuova.add(corrente);
				nazione2consorziate.put(corrente.getNazione(), nuova);
			}
		}
		return nazione2consorziate;
	}

	public int compareTo(Consorzio that) {
		return this.getNome().compareTo(that.getNome());
	}
} 