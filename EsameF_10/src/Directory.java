import java.util.*;
public class Directory extends Risorsa{
	//	private Utente proprietario;
	//	private String nome;
	//	private List<Utente> possonoLeggere;
	//	private List<Utente> possonoModificare;
	private Set<Risorsa> files;

	public Directory(String nome, Utente proprietario) {
		super(nome, proprietario);
		//		this.nome = nome;
		//		this.proprietario = proprietario;
		//		this.possonoLeggere= new ArrayList<Utente>();
		//		this.possonoModificare = new ArrayList<Utente>();
		this.files = new HashSet<>();
	}
	@Override
	public int getDimensioni() {
		int dimensioni = 0;
		for(Risorsa file : this.files)
			dimensioni += file.getDimensioni();
		return dimensioni;
	}

} 