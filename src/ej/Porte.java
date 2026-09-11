public class Porte extends Bloc{
    private boolean verouille;

    public Porte(int longueur, int largeur, int hauteur, boolean verouille) {
        super(longueur, largeur, hauteur);
        this.verouille = verouille;
    }

    public boolean estVerouille() {
        return verouille;
    }
}
