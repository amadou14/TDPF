

import java.util.Set;

public interface Arbre <T> {
    int taille();
    boolean contient(final <T> val);
    Set<T> valeurs();
     T Integer somme();
     T Integer min();
     T Integer max();
    boolean estTrie();
}