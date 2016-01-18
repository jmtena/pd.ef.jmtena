package es.upm.miw.pd.epf.flyweight;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TextoTest {
	private FactoriaCaracter factoriaCaracter;
	private Caracter[] caracteres;
	private Parrafo[] parrafos;
	private Texto txt;
	
	@Before
    public void ini() {
		factoriaCaracter = FactoriaCaracter.getFactory();
		inicializarCaracteres();
		inicializarParrafos();
		inicializarTexto();
    }

	//Tests para la clase Caracter
	
	@Test
	public void testCaracter(){
		assertEquals(factoriaCaracter.getCaracter('h'),caracteres[0]);
	}
	
	@Test
	public void testCaracterPrint(){
		assertEquals("h",caracteres[0].print(false));
		assertEquals("H",caracteres[0].print(true));
	}
	
	@Test
	public void testCaracterAdd(){
		caracteres[0].add(factoriaCaracter.getCaracter('c'));
		assertEquals(factoriaCaracter.getCaracter('h'),caracteres[0]);
		
		caracteres[0].add(new Parrafo());
		assertEquals(factoriaCaracter.getCaracter('h'),caracteres[0]);
		
		caracteres[0].add(new Texto());
		assertEquals(factoriaCaracter.getCaracter('h'),caracteres[0]);
	}
	
	@Test
	public void testCaracterRemove(){
		caracteres[0].remove(factoriaCaracter.getCaracter('c'));
		assertEquals(factoriaCaracter.getCaracter('h'),caracteres[0]);
		
		caracteres[0].remove(new Parrafo());
		assertEquals(factoriaCaracter.getCaracter('h'),caracteres[0]);
		
		caracteres[0].remove(new Texto());
		assertEquals(factoriaCaracter.getCaracter('h'),caracteres[0]);
	}
	
	//Tests para la clase párrafo
	
	@Test
	public void testParrafoAddCaracter(){
		assertEquals(5,parrafos[0].size());
		assertEquals(8,parrafos[1].size());
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testParrafoAddParrafo(){
		parrafos[0].add(new Parrafo());
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testParrafoAddTexto(){
		parrafos[0].add(new Texto());
	}
	
	@Test
	public void testParrafoRemoveCaracter(){
		assertEquals(5,parrafos[0].size());
		assertEquals(8,parrafos[1].size());
		
		parrafos[0].remove(caracteres[0]);
		parrafos[1].remove(caracteres[5]);
				
		assertEquals(4,parrafos[0].size());
		assertEquals(7,parrafos[1].size());
	}
	
	@Test
	public void testParrafoRemoveParrafo(){
		parrafos[0].remove(parrafos[0]);
		assertEquals(5,parrafos[0].size());
	}
	
	@Test
	public void testParrafoRemoveTexto(){
		parrafos[0].remove(txt);
		assertEquals(5,parrafos[0].size());
	}
	
	@Test
	public void testParrafoPrint(){
		assertEquals("hola!\n",parrafos[0].print(false));
		assertEquals("HOLA!\n",parrafos[0].print(true));
	}
	
	//Tests para la clase texto
	
	@Test
	public void testTextoAddParrafo(){
		txt.add(parrafos[1]);
		assertEquals(2,txt.size());
	}
	
	@Test 
	public void testTextoAddTexto(){
		Texto new_txt = new Texto();
		new_txt.add(parrafos[1]);
		
		int numParrafosAntes = txt.getParrafos();
		txt.add(new_txt);
		
		assertEquals(1,numParrafosAntes);
		assertEquals(2,txt.getParrafos());
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testTextoAddCaracter(){
		txt.add(factoriaCaracter.getCaracter('c'));
	}
	
	@Test
	public void testTextoRemoveTexto(){
		Texto new_txt = new Texto();
		new_txt.add(parrafos[1]);
		txt.add(new_txt);
		
		assertEquals(2,txt.getParrafos());
		txt.remove(new_txt);
		assertEquals(1,txt.getParrafos());
	}
	
	@Test
	public void testTextoRemoveParrafo(){
		txt.remove(parrafos[0]);
		assertEquals(0,txt.getParrafos());
	}
	
	@Test
	public void testTextoRemoveCaracter(){
		assertEquals(1,txt.getParrafos());
		txt.remove(factoriaCaracter.getCaracter('h'));
		assertEquals(1,txt.getParrafos());
	}
	
	@Test
	public void testTextoPrint(){
		txt.add(parrafos[1]);
		assertEquals("hola!\nque tal?\n\n---o---",txt.print(false));
		assertEquals("HOLA!\nQUE TAL?\n\n---o---",txt.print(true));
	}
	
	private void inicializarCaracteres(){
		caracteres = new Caracter[13];
        caracteres[0] = factoriaCaracter.getCaracter('h');
        caracteres[1] = factoriaCaracter.getCaracter('o');
        caracteres[2] = factoriaCaracter.getCaracter('l');
        caracteres[3] = factoriaCaracter.getCaracter('a');
        caracteres[4] = factoriaCaracter.getCaracter('!');
        
        caracteres[5] = factoriaCaracter.getCaracter('q');
        caracteres[6] = factoriaCaracter.getCaracter('u');
        caracteres[7] = factoriaCaracter.getCaracter('e');
        caracteres[8] = factoriaCaracter.getCaracter(' ');
        caracteres[9] = factoriaCaracter.getCaracter('t');
        caracteres[10] = factoriaCaracter.getCaracter('a');
        caracteres[11] = factoriaCaracter.getCaracter('l');
        caracteres[12] = factoriaCaracter.getCaracter('?');
	}
	
	private void inicializarParrafos(){
		 parrafos = new Parrafo[2];
		 parrafos[0] = new Parrafo();
		 parrafos[1] = new Parrafo();
				 
	     parrafos[0].add(caracteres[0]);
	     parrafos[0].add(caracteres[1]);
	     parrafos[0].add(caracteres[2]);
	     parrafos[0].add(caracteres[3]);
	     parrafos[0].add(caracteres[4]);
	       
	     parrafos[1].add(caracteres[5]);
	     parrafos[1].add(caracteres[6]);
	     parrafos[1].add(caracteres[7]);
	     parrafos[1].add(caracteres[8]);
	     parrafos[1].add(caracteres[9]);
	     parrafos[1].add(caracteres[10]);
	     parrafos[1].add(caracteres[11]);
	     parrafos[1].add(caracteres[12]);
	}
	
	private void inicializarTexto(){
		 txt = new Texto();
	     txt.add(parrafos[0]);
	}
}
