public class Mur extends Bloc{
    private boolean porteur;
    private boolean traversable;

    public Mur(int longueur, int largeur, int hauteur, boolean porteur) {
        super(longueur, largeur, hauteur);
        this.porteur = porteur;
    }

    public boolean setTraversable() {
        return !porteur;
    }


}
