import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelezionaAutoriGiovani implements Selezionatore{
//salvo una lista di tutti autori con eta max
	@Override
	public List<Autore> eseguiSelezione(List<Libro> libriInBiblioteca) {
		List<Autore> l = new ArrayList<>();
		for(Libro corrente : libriInBiblioteca)
			for(Autore a : corrente.getAutori())
				l.add(a);
		Collections.sort(l, new ComparatoreEta());
		int anno = l.get(l.size()-1).getAnnoNascita();
		for(Autore a : l)//rimuovo chi non rispoetta i criteri
			if(a.getAnnoNascita()!= anno)
				l.remove(a);
		return l;
	}

}
