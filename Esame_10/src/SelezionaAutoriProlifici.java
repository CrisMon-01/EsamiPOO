import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SelezionaAutoriProlifici implements Selezionatore{

	@Override
	public List<Autore> eseguiSelezione(List<Libro> libriInBiblioteca) {
		// TODO Auto-generated method stub
		//ordino in f dei valori
		Map<Integer, Set<Autore>> mappa = new TreeMap<>();
		Map<Autore, Integer> ausilio = new TreeMap<>();
		for(Libro corrente : libriInBiblioteca)
			for(Autore a : corrente.getAutori()){
				if(ausilio.containsKey(a)){
					ausilio.put(a, ausilio.get(a)+1);
				}
				else ausilio.put(a, 1);	
			}	
		for(Autore a : ausilio.keySet()){
			Integer i = ausilio.get(a);
			if(mappa.containsKey(i))
				mappa.get(i).add(a);
			else{
				Set<Autore> s = new HashSet<>();
				s.add(a);
				mappa.put(i, s);
			}
		}	//selezione dei max esponenti in f della chiave
		Integer i = Collections.max(ausilio.values());
		List<Autore> prolifici = new ArrayList<>();
		prolifici.addAll(mappa.get(i));
		return prolifici;
	}
}
