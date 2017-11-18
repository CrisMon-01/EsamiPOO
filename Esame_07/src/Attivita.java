import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Attivita extends Compito{
//	private String nome;
	private int costo;
//	private String responsabile;
	public Attivita(String nome, String responsabile, int costo) {
//		this.nome = nome;
//		this.responsabile = responsabile;
		super(nome, responsabile);
		this.costo = costo;
	}
	@Override
	public int getCosto() { return this.costo; }
//	public String getNome() { return this.nome; }
//	public String getResponsabile() { return this.responsabile; }
//	public void setResponsabile(String responsabile) {this.responsabile = responsabile; }
	@Override
	public int hashCode() { return this.getNome().hashCode(); }
	@Override
	public boolean equals(Object obj) {
		Attivita attivita = (Attivita)obj;
		return this.getNome().equals(attivita.getNome());
	}
	@Override
	public Map<String, List<Compito>> responsabile2compito() {
		 Map<String, List<Compito>> responsabile2compito = new HashMap<>();
		 List<Compito> l = new ArrayList<>();
		 l.add(this);
		 responsabile2compito.put(this.getResponsabile(),l );
		 return responsabile2compito;
	}
}