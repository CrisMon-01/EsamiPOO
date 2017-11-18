package battlefield;


public class Walker extends Robot{

//	private Position posizione;
//	private int longevita;
	
	public Walker(Position p) {
	//	this.posizione = p;
	//	this.longevita = 0 ;
	super(p);
	}

	/*public Position getPosizione() {
		return this.posizione;
	}
	
	public int incrementaLongevita() {
		return ++this.longevita;
	}
	
	public int getLongevita() {
		return this.longevita;
	}*/
	public void passo(Battlefield field) {
		Position nuova = this.decidiDoveAndare(field);
		if (nuova!=null) {
			Walker clone = new Walker(nuova);
			field.add(clone);
		}
		this.incrementaLongevita();
	}
	
	public Position decidiDoveAndare(Battlefield field) {
		Position corrente = this.getPosizione();
		Position libera = field.posizioneLiberaVicino(corrente);
		return libera; // verso una posizione libera
					   // tutto occupato: fermo
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Walker";
	}

}

