
import static org.junit.Assert.*;
public class App {

	public static void main(String[] args) {
	
	    }

	    public static final Arbre arbre1() {
	        final Arbre <String>f1 = new  <String>Feuille(1);
	        final Arbre f2 = new Feuille(2);
	        final Arbre n1 = new Noeud(List.of(f1,f2));
	        final Arbre f3 = new Feuille(3);
	        final Arbre n2 = new Noeud(List.of(n1,f3));
	        return n2;
	    }

	    public static final Arbre arbre2() {
	        final Arbre<Double> f1 = new <Double>Feuille(2);
	        final Arbre <Double>f2 = new <Doouble> Feuille(3);
	        final Arbre<Double> n1 = new Noeud<Double>(List.of(f1,f2));
	        final Arbre<Double> f3 = new<Double> Feuille(1);
	        final Arbre<Double>n2 = new Noeud<Double>(List.of(n1,f3));
	        return n2;
	    }

	    public static final Arbre arbre3() {
	        final Arbre f1 = new Feuille(2);
	        final Arbre f2 = new Feuille(1);
	        final Arbre n1 = new Noeud(List.of(f1,f2));
	        final Arbre f3 = new Feuille(3);
	        final Arbre n2 = new Noeud(List.of(n1,f3));
	        return n2;
	    }

	    @Test public void testSize() {
	        assertEquals(0, arbre0().taille());
	        assertEquals(3, arbre1().taille());
	        assertEquals(3, arbre2().taille());
	        assertEquals(3, arbre3().taille());
	    }

	    @Test public void testContient() {
	        assertFalse(arbre0().contient(1));
	        assertFalse(arbre0().contient("a"));
	        assertFalse(arbre0().contient("b"));
	        assertFalse(arbre0().contient("2.0"));
	        assertTrue(arbre1().contient(1));
	        assertTrue(arbre2().contient(1));
	        assertTrue(arbre3().contient(1));
	       
	    }

	    @Test public void testValeurs() {
	        final Set<T> contenu = Set.of("a","b","c");
	        assertEquals(Set.of(), arbre0().valeurs(2.0,1.0));
	        assertEquals(contenu, arbre1().valeurs());
	        assertEquals(contenu, arbre2().valeurs());
	        assertEquals(contenu, arbre3().valeurs());
	    }

	    @Test public void testValeur() {
	        assertEquals(null, arbre0().somme());
	        assertEquals((T) 6, arbre1().somme());
	        assertEquals((T) 6, arbre2().somme());
	        assertEquals((T) 6, arbre3().somme());
	    }

	    @Test public void testMin() {
	        assertEquals(null, arbre0().min());
	        assertEquals((Integer) 1, arbre1().min());
	        assertEquals((Integer) 1, arbre2().min());
	        assertEquals((Integer) 1, arbre3().min());
	    }

	    @Test public void testMax() {
	        assertEquals(null, arbre0().max());
	        assertEquals((Integer) 3, arbre1().max());
	        assertEquals((Integer) 3, arbre2().max());
	        assertEquals((Integer) 3, arbre3().max());
	    }

	    @Test public void testEstTrie() {
	        assertTrue(arbre0().estTrie());
	        assertTrue(arbre1().estTrie());
	        assertFalse(arbre2().estTrie());
	        assertFalse(arbre3().estTrie());
	    }

	}

		

	}

}
