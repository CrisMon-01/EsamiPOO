package battlefield;

public class Chaser extends Robot{

	//	private Position posizione;
	//	private int longevita;

	public Chaser(Position p) {
		//		this.posizione = p;
		//		this.longevita = 0 ;
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
	}
	 */
	public void passo(Battlefield field) {
		Position nuova = this.decidiMossa(field);
		if (nuova!=null) {
			Chaser clone = new Chaser(nuova);
			field.add(clone);
		}
		this.incrementaLongevita();
	}

	public Position decidiMossa(Battlefield field) {
		Robot inseguito = cercaAvversario(field);
		if (inseguito==null) 
			return null; /* nessuno da inseguire: stai fermo */
		else return inseguito.getPosizione();
	}

	private Robot cercaAvversario(Battlefield field) {
		for(Position p : field.adiacenti(this.getPosizione())) {
			//	Walker vicino = field.getWalker(p);
			Robot vicino = field.getRobot(p);
			if (isAvversario(vicino)) {
//				Position k = new Position(0, 0);
//				Walker w = new Walker(k);
//				if(vicino.getClass()==w.getClass())
					return vicino;
			}
		}
		return null;
	}

	private boolean isAvversario(Object avvistato) {
		return true ; /* è sicuramente un Walker??? per ora SI! */
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Chaser";
	}

}

