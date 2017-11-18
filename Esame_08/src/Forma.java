import java.util.Comparator;

public abstract class Forma implements Comparable<Forma>{
	private Colore colore;
	private Punto punto;
	public Forma(Colore colore, Punto origine){
		this.colore = colore;
		this.punto = origine;
	}
	public Colore getColore(){
		return this.colore;
	}
	public Punto getOrigine(){
		return this.punto;
	}
	public abstract double superficie();
	@Override
	public int compareTo(Forma o) {
		// TODO Auto-generated method stub
		return Double.compare(this.superficie(),o.superficie());
	}
}
