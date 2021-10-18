

import java.util.Set;

public interface Arbre <T> {
    int taille();
   //boolean contien<T> val);
    Set<T> valeurs();
     T  somme();
     T  min();
     T max();
    boolean estTrie();
}