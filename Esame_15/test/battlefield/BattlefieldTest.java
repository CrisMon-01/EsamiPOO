package battlefield;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import org.junit.Before;
import org.junit.Test;

/* Modificare la classe Position affinche' 
 * il primo test abbia successo (vedi DOMANDA 1) 
 */
public class BattlefieldTest{
	
	private Battlefield field;
	
	@Before
	public void setUp() throws Exception {
		this.field = new Battlefield(2);
	}

	@Test
	public void testAddWalker() {
		assertEquals(0, this.field.getAllRobot().size());
		this.field.add(new Walker(new Position(0,0)));
		assertEquals(1, this.field.getAllRobot().size());
	}
	
	@Test
	public void testRaggruppaRobotDiDueTipiDiversi() {
		//fail("vedi DOMANDA 3");
		Walker w = new Walker(new Position(0 , 0));
		Chaser c = new Chaser(new Position(1 , 1));
		this.field.add(w);
		this.field.add(c);
		assertEquals(2, this.field.getAllRobot().size());
		Map<Position,Robot> l = new HashMap<>();		
		l.put(w.getPosizione(),w);
		l.put(c.getPosizione(),c);
		assertEquals(l.values().toString(), this.field.getAllRobot().toString());
	}

}
