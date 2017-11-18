import java.util.Comparator;

public class ComparatoreLuminosita implements Comparator<Forma>{

	@Override
	public int compare(Forma arg0, Forma arg1) {
		// TODO Auto-generated method stub
		int delta = arg0.getColore().luminosita()-arg1.getColore().luminosita();
		if(delta==0)
			delta = -1;
		return delta;
	}
	

}
