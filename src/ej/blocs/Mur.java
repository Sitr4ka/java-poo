package ej.blocs;

import ej.exceptions.IllegalBlocException;

public class Mur extends Bloc{

    private boolean porteur;

    public Mur(int longueur, int largeur, int hauteur, boolean porteur)
            throws IllegalBlocException {
        super(longueur, largeur, hauteur, Couleur.GRIS);
        this.porteur = porteur;
    }

    public boolean estTraversable() {
        return !porteur;
    }

}
