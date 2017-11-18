import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConsorsioTest {
	private Consorzio c1;
	private Impresa i1;
	private Impresa i2; 
	private Impresa i3;
	private Consorzio cv;
	
	@Before
	public void setUp(){
		c1 = new Consorzio(1000,"Ita","c1");
		cv = new Consorzio(0, "Fra", "c2");
		i1 = new Impresa(0, "Ita", "i1");
		i2 = new Impresa(1, "ITA", "i2");
		i3 = new Impresa(0, "ITA", "");
		c1.aggiungiConsorziata(i1);
	}
	@Test
	public void testNumeroDip(){
		i1.aggiungiDipendente(new Dipendente());
		assertEquals(1, i1.getNumeroDipendenti());
		i1.aggiungiDipendente(new Dipendente());
		assertEquals(2, i1.getNumeroDipendenti());
	}
//	(i) consorzio vuoto,
//	(ii) consorzio composto da una singola impresa,
//	(iii) consorzio composto da due imprese con sede in nazioni diverse,
//	(iv) consorzio composto da due imprese con sede nella stessa nazione.
	@Test
	public void testNaz2ConsVuoto(){
		assertEquals(0, cv.nazione2consorziate().keySet().size());
		assertNull(cv.nazione2consorziate().get("Fra"));
	}
	@Test
	public void testNaz2Cons1(){
	assertEquals(1,c1.nazione2consorziate().keySet().size());
	}
	@Test
	public void testNaz2Cons2(){
	c1.aggiungiConsorziata(i2);
	assertEquals(2,c1.nazione2consorziate().keySet().size());
	}
	@Test
	public void testNaz2Cons2Uguali(){
	c1.aggiungiConsorziata(i2);
	c1.aggiungiConsorziata(i3);
	assertEquals(2,c1.nazione2consorziate().keySet().size());
	assertEquals(2, c1.nazione2consorziate().get("ITA").size());
	}
	
}
