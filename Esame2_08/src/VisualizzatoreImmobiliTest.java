import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VisualizzatoreImmobiliTest {
	private VisualizzatoreImmobiliPerSuperficie v;
	private MercatoImmobiliare m;
	private VisualizzatoreImmobiliPerSuperficie vv;
	private MercatoImmobiliare mv;
	private Immobile i1;
	private Immobile i2;
	private Immobile i3;
	@Before
	public void setUp(){
		this.vv = new VisualizzatoreImmobiliPerSuperficie();
		this.mv = new MercatoImmobiliare(); 
		this.v = new VisualizzatoreImmobiliPerSuperficie(); 
		this.m = new MercatoImmobiliare();
		v.setMercatoImmobiliare(m);
		i1 = new Immobile("ind 1", 100, 10, 1);
		i2 = new Immobile("ind 2", 101, 10, 1);
		i3 = new Immobile("ind 3", 101, 10, 3);
		m.aggiungiImmobile(i1);
		m.aggiungiImmobile(i2);
		m.aggiungiImmobile(i3);
	}

	@Test
	public void testVuoto(){
		assertEquals(0, vv.superficie2immobili().size());
	}
	@Test
	public void testUno(){
		mv.aggiungiImmobile(i1);
		vv.setMercatoImmobiliare(mv);
		assertEquals(1, vv.superficie2immobili().size());
	}
	@Test
	public void testDueDiverse(){
		mv.aggiungiImmobile(i1);
		mv.aggiungiImmobile(i2);
		vv.setMercatoImmobiliare(mv);
		assertEquals(2, vv.superficie2immobili().size());
	}
	@Test 
	public void testConUguali(){
		assertEquals(2, v.superficie2immobili().size());
		assertEquals(2, v.superficie2immobili().get(101).size());
	}
}
