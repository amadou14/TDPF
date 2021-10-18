package td1.arbres;

import java.util.Set;

public class Feuille implements Arbre {

    private final int valeur;

    public Feuille(final int valeur) {
        this.valeur = valeur;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(final Integer val) {
        return val.equals(valeur);
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(valeur);
    }

    @Override
    public T somme() {
        return valeur;
    }

    @Override
    public T min() {
        return valeur;
    }

    @Override
    public T max() {
        return valeur;
    }

    /**
     * une feuille est toujours triée.
     */
    @Override
    public boolean estTrie() {
        return true;
    }
    
}