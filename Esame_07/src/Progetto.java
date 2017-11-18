import java.util.*;
public class Progetto extends Compito{
	private List<Compito> elencoCompito;
	//	private String nome;
	//	private String responsabile;
	public Progetto(String nome, String responsabile) {
		//		this.nome = nome;
		//		this.responsabile = responsabile;
		super(nome, responsabile);
		this.elencoCompito = new ArrayList<Compito>();
	}
	public void addCompito(Compito c) {
		this.elencoCompito.add(c);
		Collections.sort(elencoCompito, new ComparatoreCosto());
	}
	//	public String getNome() { return this.nome; }
	//	public String getResponsabile() { return this.responsabile; }
	//	public void setResponsabile(String responsabile) {this.responsabile = responsabile; } 		
	@Override
	public int hashCode() { return this.getNome().hashCode(); }
	@Override
	public boolean equals(Object obj) {
		Progetto progetto = (Progetto)obj;
		return this.getNome().equals(progetto.getNome());
	}
//	public Map<String, List<Attivita>> responsabile2attivita(){
//		Map<String, List<Attivita>> resp2attivita = new HashMap<String, List<Attivita>>();
//		for(Compito c : this.elencoCompito){
//			Attivita a = new Attivita("", "",0);
//			if(c.getClass()==a.getClass()){
//				if(resp2attivita.containsKey(c.getResponsabile()))
//					resp2attivita.get(c.getResponsabile()).add((Attivita) c);
//				else{ List<Attivita> nuova = new ArrayList<>();
//				nuova.add((Attivita) c);
//				resp2attivita.put(c.getResponsabile(), nuova);
//				}
//			}
//		}
//		return resp2attivita;
//	}
	@Override
	public int getCosto() {
		// TODO Auto-generated method stub
		int tot = 0;
		for(Compito c : this.elencoCompito)
			tot = tot + c.getCosto();
		return tot;
	}
	@Override
	public Map<String, List<Compito>> responsabile2compito() {
		Map<String, List<Compito>> resp2compito= new HashMap<String, List<Compito>>();
		for(Compito c : this.elencoCompito){
			if(resp2compito.containsKey(c.getResponsabile()))
				resp2compito.get(c.getResponsabile()).add(c);
			else{List<Compito> nuovoc = new ArrayList<>();
			nuovoc.add(c);
			resp2compito.put(c.getResponsabile(), nuovoc);
			}
		}
		return resp2compito;
	}

}