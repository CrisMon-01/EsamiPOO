
public abstract class Forma implements Comparable<Forma>{
	private Colore colore;
	private Punto punto;
	public Forma(Colore colore, Punto centro){
		this.colore = colore;
		this.punto = centro;
	}
	public Colore getColore(){
		return this.colore;
	}
	public Punto getPuntoOrigine(){
		return this.punto;
	}
	public abstract double superficie();
	@Override
	public int compareTo(Forma o) {
		// TODO Auto-generated method stub
		if(this.superficie()>o.superficie())
			return 1;
		if(this.superficie()>o.superficie())
			return -1;
		if(this.superficie()==o.superficie() && this.getClass()!=o.getClass())
			return 1;
		return 0;
	}

}
