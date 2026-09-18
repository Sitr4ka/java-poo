public class Porte extends Bloc{
    private boolean verouille;

    public Porte(int longueur, int largeur, int hauteur, boolean verouille) {
        super(longueur, largeur, hauteur);
        this.verouille = verouille;
        this.couleur = Couleur.BLEU;
    }
    public boolean estVerouille() {
        return verouille;
    }
}
