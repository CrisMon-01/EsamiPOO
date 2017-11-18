import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class testForme {
private Punto o;
private Punto p1;
private Punto p2;
private Colore col1;
private Colore col2;
private Cerchio c1;
private Cerchio c2;
private Rettangolo r1;
private Rettangolo r2;
private Disegno d1;
private Disegno dv;
@Before
public void setUp(){
	o = new Punto(0, 0);
	p1 = new Punto(10, 10);
	col1 = new Colore(0, 0, 0);
	col2 = new Colore(1, 1, 1);
	c1 = new Cerchio(col1, o, 5);
	c2 = new Cerchio(col2, p1, 3);
	r1 = new Rettangolo(col1, o, 2, 3);
	r2 = new Rettangolo(col2, p2, 1, 1);
	d1 = new Disegno();
	dv = new Disegno();
}
@Test
public void testcolore2FormeVuoto(){
	assertEquals(0, dv.colore2forme().size());
}
@Test
public void testcolore2FormeUna(){
	this.d1.aggiungiForma(c1, 1);
	Map<Colore, List<Forma>> mappa = d1.colore2forme();
	assertEquals(1, mappa.size());
}
@Test
public void testcolore2FormeDuecoloreDiv(){
	this.d1.aggiungiForma(c1, 0);
	this.d1.aggiungiForma(c2, 0);
	assertEquals(2, d1.colore2forme().size());
}
@Test
public void testcolore2FormeDueColoreUguale(){
	this.d1.aggiungiForma(c1, 0);
	d1.aggiungiForma(r1, 0);
	assertEquals(1, d1.colore2forme().size());
}
@Test
public void testOrdinatiPerLum(){
	this.d1.aggiungiForma(c1, 0);
	this.d1.aggiungiForma(c2, 0);
	this.d1.aggiungiForma(r2, 0);
	assertEquals(3, d1.formeOrdinatePerLuminosita().size());
	assertEquals(c1, d1.formeOrdinatePerLuminosita().get(0));
}
}
