import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mur mur = new Mur(13, 15, 45, true);
        System.out.println(mur.couleur);
        Bloc porte = new Porte(13, 15, 45, true);
        System.out.println(porte.couleur);
        porte.setCouleur(Couleur.MARRON);
        System.out.println(porte.couleur);
    }
}