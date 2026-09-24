import java.awt.print.PrinterAbortException;

public class Porte extends Bloc {
    private boolean verouille;

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
            throw new PorteVerouilleException();
        } else {
            verouille = true;
        }
    }

    @Override
    public void afficherDescription() {

    }
}
