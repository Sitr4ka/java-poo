import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Kit {
    private Set<IBloc> blocs = new LinkedHashSet<>();
    private Set<String> motsCles;

    public Kit() {
        try {
            blocs.add(new Mur(3, 2, 2, true));
            blocs.add(new Mur(3, 2, 2, true));
            blocs.add(new Mur(3, 2, 2, false));
            blocs.add(new Mur(3, 2, 2, false));
            blocs.add(new Porte(3, 2, 2, true));
        } catch (IllegalBlocException e) {

        }
    }

    public void afficherKit() {
        System.out.println("Nombre de bloc dans le kit: " + blocs.size());
        System.out.print("Liste des mots clés du kit: ");
        for (String motCle : motsCles) {
            System.out.print(motCle + " ");
        }
    }

    public Set<String> getMotsCles() {
        return motsCles;
    }

    public Set<IBloc> getBlocs() {
        return blocs;
    }
}
