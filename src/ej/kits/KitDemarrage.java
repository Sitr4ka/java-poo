package ej.kits;

import ej.blocs.IBloc;
import ej.exceptions.IllegalBlocException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class KitDemarrage {
    private Logger logger = LogManager.getLogger(KitDemarrage.class);
    private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
    private Set<String> motsCles = new LinkedHashSet<String>();

    public Set<IBloc> getBlocs() {
        return blocs;
    }

    public Set<String> getMotsCles() {
        return motsCles;
    }

    public KitDemarrage(final Set<IBloc> blocs) throws IllegalBlocException {
        this.blocs.addAll(blocs);

        motsCles.add("Cabane");
        motsCles.add("Muraille");
        motsCles.add("Maison");
    }

    public void afficherKit() {
        System.out.println("Nombre de blocs dans le kit : " + blocs.size());
        System.out.print("Liste des mots clés du kit : ");
        for (String motCle : motsCles) {
            System.out.print(motCle + " ");
        }
    }

    public void sauvegarder() {
        StringBuilder builder = new StringBuilder();
        builder.append("Kit de démarrage: \n");
        for (String motcle : motsCles) {
            builder.append(motcle).append(" ");
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("kit.txt"));
            writer.write(builder.toString());
            writer.close();
            logger.info("Fichier kit.txt mis à jour.");
        } catch (IOException e) {
            logger.error("Impossible d'écrire dans le fichier.");
        }
    }

    public void charger() {
        try (BufferedReader reader = new BufferedReader(new FileReader("kit.txt"))){
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            logger.error("Le fichier kit.txt n'existe pas.");
        } catch (IOException e) {
            logger.error("Impossible de lire le fichier kit.txt");
        }
    }

}