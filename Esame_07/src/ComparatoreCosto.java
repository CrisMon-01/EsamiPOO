import java.util.Comparator;

public class ComparatoreCosto implements Comparator<Compito> {

	@Override
	public int compare(Compito arg0, Compito arg1) {
		// TODO Auto-generated method stub
		int delta = arg0.getCosto()-arg1.getCosto();
		if(delta == 0)
			delta = arg0.getNome().compareTo(arg1.getNome());
		return delta;
	}

}
