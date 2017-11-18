import java.util.Comparator;

public class ComparatoreVaniPrezzo implements Comparator<Immobile>{

	@Override
	public int compare(Immobile o1, Immobile o2) {
		// TODO Auto-generated method stub
		int delta = o1.getVani()-o2.getVani();
		if(delta == 0)
			delta = o1.getPrezzo()-o2.getPrezzo();
		return delta;
	}

}
