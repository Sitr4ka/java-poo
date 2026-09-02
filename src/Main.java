import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int cpt = 0;
        int[] nombre = {10, 20, 0, 40, 0, 60, 0};
        for (int num : nombre) {
            if (num == 0) {
                cpt++;
            }
        }

        System.out.println(cpt);
    }
}