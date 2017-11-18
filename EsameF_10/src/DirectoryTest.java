import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DirectoryTest {
	private Directory dv;
	private Directory d1;
	private Permesso p1;
	private Permesso p2;
	private Utente u1;
	private Utente u2;
	@Before
	public void setUp(){
		u1 = new Utente("u1");
		u2 = new Utente("u2");
		p1 = new Permesso("ap1");
		p2 = new Permesso("zp2");
		dv= new Directory("dv", new Utente("aaaa"));
		d1 = new Directory("d1", u1);
	}
	@Test
	public void testNessunoPresente(){
		assertFalse(dv.haIlPermesso(new Permesso("inesistente"), new Utente("inesistente")));
	}
	@Test
	public void testPermessoPresente(){
		assertFalse(dv.haIlPermesso(p1, new Utente("inesistente")));
	}
	@Test
	public void testUtPresente(){
		assertFalse(dv.haIlPermesso(new Permesso("inesistente"), u1));
	}
	@Test
	public void testListaPermessiSenza(){
		assertEquals(0, d1.permessiDi(u1).size());
	}
	@Test
	public void testListaPermessiUno(){
		d1.concediPermesso(p1, u1);
		assertEquals(1, d1.permessiDi(u1).size());
	}
	@Test
	public void testListaPermessiOrdineAlfa(){
		d1.concediPermesso(p2, u1);
		d1.concediPermesso(p1, u1);
		assertEquals(2, d1.permessiDi(u1).size());
		assertEquals(p1, d1.permessiDi(u1).get(0));
	}
	
}
