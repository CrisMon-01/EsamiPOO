import java.util.Comparator;

public class ComparatorePrezzo implements Comparator<Immobile>{

	@Override
	public int compare(Immobile o1, Immobile o2) {
		// TODO Auto-generated method stub
		return o1.getPrezzo()-o2.getPrezzo();
	}

}
