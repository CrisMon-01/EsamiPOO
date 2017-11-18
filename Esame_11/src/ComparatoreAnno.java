import java.util.Comparator;

public class ComparatoreAnno implements Comparator<Societa>{


	@Override
	public int compare(Societa o1, Societa o2) {
		// TODO Auto-generated method stub
		return o1.getAnnoCotruzione()-o2.getAnnoCotruzione();
	}

}
