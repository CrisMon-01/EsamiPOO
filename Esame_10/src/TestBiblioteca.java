import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBiblioteca {
	private Biblioteca b;
	private Autore a1;
	private Autore a2;
	private Libro l1;
	private Libro l2;
	private Libro l3;
	@Before
	public void setUp(){
		b = new Biblioteca();
		a1 = new Autore("autore", 2000);
		a2 = new Autore("autore1", 000);
		l1 = new Libro("lbro1");
		l2 = new Libro("libro2");
		l3 = new Libro("libro3");
		l3.addAutore(a1);
		l2.addAutore(a2);
		l1.addAutore(a2);
	}
	@Test
	public void testAutore2LibVuoto(){
		assertEquals(0, b.autore2libri().size());
	}
	@Test
	public void testAutore2LibriSingolo(){
		b.addLibro("uno", l1);
		assertEquals(1, b.autore2libri().size());
	}
	@Test
	public void testAutore2LibriStessoAutore(){
		b.addLibro("uno", l1);
		b.addLibro("due", l2);
		b.addLibro("tre", l3);
		assertEquals(2, b.autore2libri().size());
	}
	
	
}
