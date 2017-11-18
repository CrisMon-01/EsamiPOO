
public abstract class Visualizzatore {
	private MercatoImmobiliare mercato;
	public Visualizzatore(){
		this.mercato = new MercatoImmobiliare();
	}
	public void setMercatoImmobiliare(MercatoImmobiliare mercato) {
		this.mercato = mercato;
	}
	
	public MercatoImmobiliare getMercato(){
		return this.mercato;
	}

	public abstract void aggiornaGrafico();
}
