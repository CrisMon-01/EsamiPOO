import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

public class DisegnoTest {
	private Disegno d;
	private Forma c1;
	private Forma c2;
	private Forma r1;
	private Forma r2;
	private Punto p1;
	private Punto p2;
	private Punto p3;
	private Punto p4;
	List<Forma> l ;
	
	@Before
	public void setUp(){
		d = new Disegno();
		p1 = new Punto(0, 0);
		p2 = new Punto(0, 2);
		p3 = new Punto(2, 0);
		p4 = new Punto(3, 3);
		c1 = new Cerchio(new Colore(0, 0, 0), p1, 5);
		c2 = new Cerchio(new Colore(0, 1, 1), p2, 5);
		r1 = new Rettangolo(new Colore(1, 1, 0), p3, 2, 3);
		r2 = new Rettangolo(new Colore(0, 0, 0), p4, 9, 9);
		l = new ArrayList<>();
		l.add(c1);
	}
	
	@Test
	public void testcolore2formeVuote(){
		assertEquals(new HashMap<>(), this.d.colore2forme());
	}
	@Test
	public void testColore2FormeUna(){
		this.d.aggiungiForma(c1, 0);
		assertEquals(1,this.d.colore2forme().size());
	}
	@Test
	public void testColore2FormeDueUguali(){
		this.d.aggiungiForma(c1, 0);
		this.d.aggiungiForma(r2, 0);
		assertEquals(1,this.d.colore2forme().size());
	}
	@Test
	public void testColore2FormeTreTuttiDiversi(){
		this.d.aggiungiForma(c1, 0);
		this.d.aggiungiForma(c2, 0);
		this.d.aggiungiForma(r1, 1);
		assertEquals(3,this.d.colore2forme().size());
	}
	@Test
	public void testOrdinatiPerLumVuoto(){
		assertEquals(new ArrayList<>(),d.formeOrdinatePerLuminosita());	//strano
	}
	@Test
	public void testOrdinatiPerLumDueUguali(){
		this.d.aggiungiForma(c1, 0);
		assertEquals(1, d.formeOrdinatePerLuminosita().size());
	}
	@Test
	public void testOrdinatiPerLumDue(){
		this.d.aggiungiForma(c1, 0);
		this.d.aggiungiForma(c2, 1);
		assertEquals(2, d.formeOrdinatePerLuminosita().size());
	}
	
	@Test
	public void testOrdinatiPerLumDueUgualiLum(){
		this.d.aggiungiForma(c1, 0);
		this.d.aggiungiForma(c2, 0);
		this.d.aggiungiForma(r2, 0);
		assertEquals(3, d.formeOrdinatePerLuminosita().size());
		assertEquals(c1, d.formeOrdinatePerLuminosita().get(0));
		assertEquals(r2, d.formeOrdinatePerLuminosita().get(1));
		assertEquals(c2, d.formeOrdinatePerLuminosita().get(2));
	}
	
}
