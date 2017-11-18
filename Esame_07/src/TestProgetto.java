import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestProgetto {
private Compito c1;
private Attivita a1;
private Progetto p;
@Before
public void setUp(){
	this.c1 = new Progetto("p1", "gianni");
	this.a1 = new Attivita("a1", "gianni", 1);
	this.p = new Progetto("p", "charlie");
}
@Test
public void testGetCosto(){
	assertEquals(1, a1.getCosto());
}
@Test
public void testResponsabile2Costo(){
	p.addCompito(c1);
	p.addCompito(a1);
	assertEquals(1, p.responsabile2compito().size());
}
}
