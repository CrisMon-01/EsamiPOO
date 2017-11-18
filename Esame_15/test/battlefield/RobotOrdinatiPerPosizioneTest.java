package battlefield;

import static org.junit.Assert.*;

import org.junit.*;

public class RobotOrdinatiPerPosizioneTest {
	
//	// (vedi DOMANDA 5)
//	// scrivere dei test-case minimali per il metodo
//	// Battlefield.getRobotOrdinatiPerPosizione()
//	(i) campo vuoto
//	(ii) campo contenente un singolo robot
//	(iii) campo contenente due robot in posizioni di X diversa
//	(iv) campo contenente due robot in posizione di pari X ma Y diversa
//	(v) campo contenente quattro robot
	
	@Test
	public void testgetOrdinatiperPosizione_Vuoto(){
		Battlefield vuoto = new Battlefield(0);
		assertEquals(0, vuoto.getRobotOrdinatiPerPosizione().size());
	}
	@Test
	public void testgetOrdinatiperPosizione_Singolo(){
		Battlefield singoltone = new Battlefield(1);
		Position p = new Position(0, 0);
		Walker w = new Walker(p);
		singoltone.add(w);
		assertEquals(1, singoltone.getRobotOrdinatiPerPosizione().size());
		assertEquals("[Walker]", singoltone.getRobotOrdinatiPerPosizione().toString() );
	}
	@Test
	public void testgetOrdinatiperPosizione_Due(){
		Battlefield due = new Battlefield(1);
		Position p = new Position(0, 0);
		Position d = new Position(1,0);
		Walker w = new Walker(p);
		Walker v = new Walker(d);
		due.add(w);
		due.add(v);
		assertEquals("[Walker, Walker]", due.getRobotOrdinatiPerPosizione().toString() );
	}
	@Test
	public void testgetOrdinatiperPosizione_DueY(){
		Battlefield due = new Battlefield(1);
		Position p = new Position(0, 0);
		Position d = new Position(0,1);
		Walker w = new Walker(p);
		Chaser v = new Chaser(d);
		due.add(w);
		due.add(v);
		assertEquals("[Walker, Chaser]", due.getRobotOrdinatiPerPosizione().toString() );
	}
	@Test
	public void testgetOrdinatiperPosizione_4(){
		Battlefield quattro = new Battlefield(3);
		Position p = new Position(0, 0);
		Position d = new Position(1,0);
		Walker w = new Walker(p);
		Walker v = new Walker(d);
		Chaser c1 = new Chaser(new Position(0, 1));
		Chaser c2 = new Chaser(new Position(1, 1));
		quattro.add(w);
		quattro.add(v);
		quattro.add(c1);
		quattro.add(c2);
		assertEquals("[Walker, Chaser, Walker, Chaser]", quattro.getRobotOrdinatiPerPosizione().toString() );
	}
}
