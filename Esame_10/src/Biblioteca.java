import java.util.*;
public class Biblioteca {
	private Map<String, Libro> codice2libro;
	public Biblioteca() {
		this.codice2libro = new HashMap<String, Libro>();
	}
	public void addLibro(String codice, Libro libro) {
		this.codice2libro.put(codice, libro);
	}
	//	public List<Autore> autoriGiovani() {
	//		List<Autore> autoriGiovani = null;
	//		// codice omesso
	//		return autoriGiovani;
	//	}
	public Map<Autore, Set<Libro>> autore2libri() {
		Map<Autore, Set<Libro>> autore2libri = new HashMap<>();
		Set<Libro> appoggio = new HashSet<>();
		for(Libro corrente : codice2libro.values())
			for(Autore a : corrente.getAutori()){
				if(autore2libri.containsKey(a))
					autore2libri.get(a).add(corrente);
				else{appoggio.add(corrente);
				autore2libri.put(a, appoggio);
				}
			}
		return autore2libri;
	}
	// altri metodi omessi
	List<Autore> seleziona(Selezionatore selezionatore){
		List<Libro> libriInBiblioteca = (List<Libro>) codice2libro.values();
		return selezionatore.eseguiSelezione(libriInBiblioteca);
	}
}