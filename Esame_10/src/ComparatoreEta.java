import java.util.Comparator;

public class ComparatoreEta implements Comparator<Autore> {

	@Override
	public int compare(Autore o1, Autore o2) {
		// TODO Auto-generated method stub
		return o1.getAnnoNascita()-o2.getAnnoNascita();
	}

}
