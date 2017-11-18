import java.util.*;
public class Disegno {
	private Map<Integer, List<Forma>> livello2forma;
	//	private Map<Integer, List<Cerchio>> livello2cerchi;
	public Disegno() {
		this.livello2forma = new TreeMap<Integer, List<Forma>>();
		//		this.livello2cerchi = new TreeMap<Integer, List<Cerchio>>();
	}
	public void aggiungiForma(Forma forma, int livello){
		//DOMANDA 1: scrivere il codice di questo metodo
		//DOMANDA 2: eliminare questo metodo e sostituirlo con il metodo
		List<Forma> lista = new ArrayList<>();
		lista.add(forma);
		if(livello2forma.containsKey(livello))
			lista.addAll(livello2forma.get(livello));
		livello2forma.put(livello, lista);
		// public void aggiungiForma(Forma forma, int livello)
	}
	public Set<Colore> coloriPresentiNelDisegno() {
		Set<Colore> coloriNelDisegno = null;
		//DOMANDA 3: scrivere il codice di questo metodo
		// (è possibile modificare Colore; non e’ possibile introdurre nuove classi)
		for(List<Forma> lista : livello2forma.values())
			for(Forma f : lista)
				//if(!coloriNelDisegno.contains(f.getColore()))
				coloriNelDisegno.add(f.getColore());
		return coloriNelDisegno;
	}
	public Map<Colore, List<Forma>> colore2forme() {
		Map<Colore, List<Forma>> colore2forme = new HashMap<>();
		//DOMANDA 4: scrivere il codice di questo metodo
		// (non è possibile introdurre altre classi; è possibile modificare Forma)
		for(List<Forma> gruppoCorrente : livello2forma.values()){
			for(Forma forma : gruppoCorrente){			
				if(colore2forme.containsKey(forma.getColore()))
					colore2forme.get(forma.getColore()).add(forma);
				else {List<Forma> forme = new ArrayList<>();
				forme.add(forma);
				colore2forme.put(forma.getColore(), forme);
				}
			}
		}
		return colore2forme;
	}
	public List<Forma> formeOrdinatePerLuminosita() {
		List<Forma> forme = new ArrayList<>();
		//DOMANDA 5: scrivere il codice di questo metodo
		// (non è possibile modificare Forma e Colore, è possibile introdurre nuove classi)
		for(List<Forma> gruppoCorrente : livello2forma.values()){
			for(Forma forma : gruppoCorrente){
				forme.add(forma);
			}
		}
		Collections.sort(forme, new ComparatoreLuminosita());
		return forme;
	}


}