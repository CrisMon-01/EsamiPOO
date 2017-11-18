import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VisualizzatoreImmobiliPerSuperficie extends Visualizzatore{
//	private MercatoImmobiliare mercato;
	public VisualizzatoreImmobiliPerSuperficie() {
		super();
	}
	@Override
	public void aggiornaGrafico() {
		this.visualizzaGrafico(this.superficie2immobili());
	}
	private void visualizzaGrafico(Map<Integer, List<Immobile>> mq2immobili){
	/* codice omesso perchè irrilevante ai fini del compito */ }
	public Map<Integer, List<Immobile>> superficie2immobili() {
		Map<Integer, List<Immobile>> mq2immobili = new TreeMap<>();
		// DOMANDA 1: scrivere il codice di questo metodo:
		// deve restituire una mappa che associa una superficie alla lista di
		// immobili con quella superficie.
		// Ogni lista deve essere ordinata per prezzo
		for(Immobile corrente : this.getMercato().getListino()){
			if(!mq2immobili.containsKey(corrente.getSuperficie())){
				List<Immobile> nuovametratura = new ArrayList<>();
				nuovametratura.add(corrente);
				mq2immobili.put(corrente.getSuperficie(), nuovametratura);
			}
			else{ mq2immobili.get(corrente.getSuperficie()).add(corrente);
			Collections.sort(mq2immobili.get(corrente.getSuperficie()), new ComparatorePrezzo());
			}
		}
		return mq2immobili;
	}

} 