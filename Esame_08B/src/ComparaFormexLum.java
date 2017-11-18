import java.util.Comparator;

public class ComparaFormexLum implements Comparator<Forma>{

	@Override
	public int compare(Forma o1, Forma o2) {
		// TODO Auto-generated method stub
		return o1.getColore().luminosita()-o1.getColore().luminosita();
	}

}
