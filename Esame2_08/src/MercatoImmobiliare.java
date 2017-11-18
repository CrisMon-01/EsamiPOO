import java.util.ArrayList;
import java.util.List;

public class MercatoImmobiliare {
	private List<Immobile> listino;
	private List<Visualizzatore> visualizzatori;
	public MercatoImmobiliare() {
		this.listino = new ArrayList<Immobile>();
		this.visualizzatori = new ArrayList<>();
	}
	public List<Immobile> getListino(){
		return this.listino;
	}
	public void aggiungiVisualizzatore(Visualizzatore v) {
		v.setMercatoImmobiliare(this);
		this.visualizzatori.add(v);
	}
	public void notificaAggiornamento() {
		for(Visualizzatore v : visualizzatori)
		v.aggiornaGrafico();
	}
	public void aggiungiImmobile(Immobile immobile){
		this.listino.add(immobile);
		this.notificaAggiornamento();
	}
} 