package ej.blocs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.exceptions.IllegalBlocException;

public abstract class Bloc implements IBloc{

    private static Logger logger = LogManager.getLogger(Bloc.class);

    protected int longueur;
    protected int largeur;
    protected int hauteur;
    protected Couleur couleur;

    public Bloc(final int longueur, final int largeur, final int hauteur, final Couleur couleur) throws IllegalBlocException {
        if (longueur < MIN_LONGUEUR || largeur < MIN_LARGEUR || hauteur < MIN_HAUTEUR) {
            logger.error("Les valeurs minimales pour longueur, largeur et hauteur n'ont pas été respectées.");
            throw new IllegalBlocException();
        }
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.couleur = couleur;

        logger.info("Un bloc de type {} a été construit.", this.getClass().getSimpleName());
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setCouleur(final Couleur couleur) {
        this.couleur = couleur;
    }

}