public abstract class Bloc {
    protected int longueur;
    protected int largeur;
    protected int hauteur;

    public Bloc(final int longueur, final int largeur, final int hauteur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
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

    public void setLongueur(final int longeur) {
        this.longueur = longeur;
    }

    public void setLargeur(final int largeur) {
        this.largeur = largeur;
    }

    public void setHauteur(final int hauteur) {
        this.hauteur = hauteur;
    }
}
