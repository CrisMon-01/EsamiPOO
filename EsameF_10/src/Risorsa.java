import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Risorsa {
	private Utente proprietario;
	private String nome;
	Map<Permesso, Set<Utente>> permessi;

	public Risorsa(String nome, Utente proprietario) {
		this.nome = nome;
		this.proprietario = proprietario;
		this.permessi= new HashMap<>();
	}
	public Utente getProprietario() {
		return this.proprietario;
	}
	public String getNome() {
		return this.nome;
	}
	//	public boolean puoLeggere(Utente utente){
	//		return this.possonoLeggere.contains(utente);
	//	}
	//	public boolean puoModificare(Utente utente){
	//		return this.possonoModificare.contains(utente);
	//	}
	public boolean haIlPermesso(Permesso permesso, Utente utente){
		Set<Utente> u;
		if(this.permessi.containsKey(permesso)){
			u = permessi.get(permesso);
			if(u!=null)	
				return u.contains(utente);
			return false;
		}
		return false;
	}
	void concediPermesso(Permesso permesso, Utente utente){
		Set<Utente> u;
		u = permessi.get(permesso);
		if(u==null)
			u = new HashSet<>();
		u.add(utente);
		permessi.put(permesso, u);
	}
	public List<Permesso> permessiDi(Utente utente){
		List<Permesso> ritornata = new ArrayList<>();
		for(Permesso p : permessi.keySet()){
			if(permessi.get(p).contains(utente))
				ritornata.add(p);
		}
		Collections.sort(ritornata, new ComparatorePermessoAlfabetico());
		return ritornata;
	}
	//public void abilitaLettura(Utente utente) {
	//	this.possonoLeggere.add(utente);
	//}
	//public void abilitaModifica(Utente utente) {
	//	this.possonoModificare.add(utente);
	//}
	public abstract int getDimensioni();

}
