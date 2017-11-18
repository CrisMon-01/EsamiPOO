package battlefield;

import java.util.Comparator;

public class ComparatoreperPosizione implements Comparator<Robot>{

	@Override
	public int compare(Robot r1, Robot r2) {
		// TODO Auto-generated method stub
		if(r1.getPosizione().getX()==r2.getPosizione().getX())
			return r1.getPosizione().getY()-r2.getPosizione().getY();
		return r1.getPosizione().getX()-r2.getPosizione().getX();
	}
	

}
