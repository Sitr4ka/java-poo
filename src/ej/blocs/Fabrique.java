package ej.blocs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

import static java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor;

public class Fabrique {

    private static Logger logger = LogManager.getLogger(Fabrique.class);

    public static List<IBloc> creerMur(int nb) {
        Callable<IBloc> mur = () -> { return new Mur(1, 1, 1, true);};
        return creerBloc(mur, nb);
    }

    public static List<IBloc> creerToit(int nb) {
        Callable<IBloc> toit = () -> {return new Toit(1, 1, 1);};
        return creerBloc(toit, nb);
    }

    public static List<IBloc> creerPorte(int nb) {
        Callable<IBloc> porte = () -> { return new Porte(1, 1, 1, false);};
        return creerBloc(porte, nb);
    }

    public static List<IBloc> creerBloc(Callable<IBloc> task, int quantity) {
        List<IBloc> blocs = new ArrayList<>();
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();

        List<Callable<IBloc>> tasks = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            tasks.add(task);
        }

        try {
            List<Future<IBloc>> resultats = executorService.invokeAll(tasks);
            resultats.forEach((resultat) -> {
                try {
                    blocs.add(resultat.get());
                } catch (ExecutionException | InterruptedException e) {
                    logger.error("Erreur lors de la création parallèle des blocs");
                }
            });
        } catch (InterruptedException e) {
            logger.error("Erreur lors de la création parallèle des blocs");
        }

        executorService.shutdown();
        return blocs;
    }
}
