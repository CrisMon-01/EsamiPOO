import java.util.Comparator;

public class ComparatorePermessoAlfabetico implements Comparator<Permesso>{

	@Override
	public int compare(Permesso o1, Permesso o2) {
		// TODO Auto-generated method stub
		return o1.getNome().compareTo(o2.getNome());
	}

}
