import java.util.*;
//esistono duplicati perchè uso eq. di OBJ senza ridef. hashcode, difficile creare autori =
public class Libro {
	private Set<Autore> autori;
	private String titolo;
	public Libro(String titolo) {
		this.titolo = titolo;
		this.autori = new HashSet<Autore>();
	}
	public void addAutore(Autore autore){
		this.autori.add(autore);
	}
	public Set<Autore> getAutori() {
		return Collections.unmodifiableSet(this.autori);
	}
	public String getTitolo(){
		return this.titolo;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getAutori().hashCode()+this.getTitolo().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Libro that = (Libro) obj;
		return this.getTitolo().equals(that.getTitolo()) && this.getAutori().equals(that.getAutori());
	}
	
}