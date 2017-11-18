import java.util.*;
public class Disegno {
	private Map<Integer, List<Forma>> livello2forma;
	public Disegno() {
		this.livello2forma = new TreeMap<Integer, List<Forma>>();
	}
	public void aggiungiForma(Forma f, int livello){
		//DOMANDA 1: scrivere il codice di questo metodo
		//DOMANDA 2: eliminare questo metodo e sostituirlo con il metodo
		// public void aggiungiForma(Forma forma, int livello)
		List<Forma> lista = new ArrayList<>();
		if(!livello2forma.containsKey(livello)){
			lista.add(f);
			livello2forma.put(livello, lista);
		}
		else{
			livello2forma.get(livello).add(f);
		}
	}

	public Set<Colore> coloriPresentiNelDisegno() {
		Set<Colore> coloriNelDisegno = new HashSet<>();
		//DOMANDA 3: scrivere il codice di questo metodo
		// (è possibile modificare Colore; non e’ possibile introdurre nuove classi)
		for(List<Forma> lista : livello2forma.values())
			for(Forma f : lista)
				coloriNelDisegno.add(f.getColore());
		return coloriNelDisegno;
	}
		
	public Map<Colore, List<Forma>> colore2forme() {
		Map<Colore, List<Forma>> colore2forme = new HashMap<>();
		//DOMANDA 4: scrivere il codice di questo metodo
		// (non è possibile introdurre altre classi; è possibile modificare Forma)
		for(List<Forma> lista : livello2forma.values())
			for(Forma f : lista){
				List<Forma> ritornata;
				ritornata = colore2forme.get(f.getColore());
				if(ritornata==null)
					ritornata = new ArrayList<>();
				ritornata.add(f);
				Collections.sort(ritornata);
				colore2forme.put(f.getColore(), ritornata);
			}
		return colore2forme;
	}
	public List<Forma> formeOrdinatePerLuminosita() {
		List<Forma> forme = new ArrayList<>();
		//DOMANDA 5: scrivere il codice di questo metodo
		// (non è possibile modificare Forma e Colore, è possibile introdurre nuove classi)
		for(List<Forma> lista : colore2forme().values())
			forme.addAll(lista);
		Collections.sort(forme, new ComparaFormexLum());
		return forme;
	}
}