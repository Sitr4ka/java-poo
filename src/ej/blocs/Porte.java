package ej.blocs;

import ej.IllegalBlocException;
import ej.PorteVerouilleException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Porte extends Bloc {
    private boolean verouille;

    private static Logger logger = LogManager.getLogger(Porte.class);

    public Porte(int longueur, int largeur, int hauteur, boolean verouille) throws IllegalBlocException {
        super(longueur, largeur, hauteur);
        this.verouille = verouille;
        this.couleur = Couleur.BLEU;
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

    @Override
    public void afficherDescription() {
    }
}
