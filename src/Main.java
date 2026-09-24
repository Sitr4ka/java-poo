import java.awt.print.PrinterAbortException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            Porte bloc = new Porte(1, 1, 1, false);
            bloc.afficherDescription();
            bloc.verrouiller();
        } catch (IllegalBlocException e) {
            System.out.println("Valeur pour construire le bloc invalide");
        } catch (PorteVerouilleException exception) {
            System.out.println("La porte est déjà vérrouillée.");
        }


    }
}