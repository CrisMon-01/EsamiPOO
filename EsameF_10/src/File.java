import java.util.*;
public class File extends Risorsa{
	private int dimensioni;
	//	private Utente proprietario;
	//	private String nome;
	//	private List<Utente> possonoLeggere;
	//	private List<Utente> possonoModificare;

	public File(String nome, int dimensioni, Utente proprietario) {
		super(nome, proprietario);
		//		this.nome = nome;
		this.dimensioni = dimensioni;
		//		this.proprietario = proprietario;
		//		this.possonoLeggere = new ArrayList<Utente>();
		//		this.possonoModificare = new ArrayList<Utente>();
	}
	@Override
	public int getDimensioni() {
		return this.dimensioni;
	}
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public int hashcode(){
		return this.getNome().hashCode();
	}

	public boolean equals(Object that) {
		File f = (File) that;
		return this.getNome().equals(f.getNome());
	}
} 