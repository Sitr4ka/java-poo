package ej.blocs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.exceptions.IllegalBlocException;
import ej.exceptions.PorteVerouilleException;

public class Porte extends Bloc {

    private static Logger logger = LogManager.getLogger(Porte.class);

    private boolean verouille;

    public Porte(int longueur, int largeur, int hauteur, boolean verouille)
            throws IllegalBlocException {
        super(longueur, largeur, hauteur, Couleur.BLEU);
        this.verouille = verouille;
    }

    public boolean estVerouille() {
        return verouille;
    }

    public void verrouiller() throws PorteVerouilleException {
        if (verouille) {
            logger.error("La porte ne peut pas être verouillée car c'est déjà le cas.");
            throw new PorteVerouilleException();
        } else {
            verouille = true;
        }
    }

}