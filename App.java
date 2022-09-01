/*
EJERCICIO 1: Monte Carlo (NUS)
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int dardosTotales, dardosDentro = 0;
        double x = 1, y = 0, valorPi = 0.0, extra = 0;
        // Entrada
        System.out.println("Bienvenido(a), ¿Cuál es la cantidad de dardos lanzados? ");
        dardosTotales = scan.nextInt();
        for (int i = 1; i <= dardosTotales; i++) {
            x = rand.nextDouble();
            y = rand.nextDouble();
            if (Math.pow(x, 2) + Math.pow(y, 2) < 1.0) {
                dardosDentro++;
            }
            
        }
        valorPi = (double) Math.round((4 * dardosDentro * 1.0) * 10000 / (dardosTotales * 1.0 - extra)) / 10000;
        System.out.print("Cantidad de dardos totales: "+dardosTotales+"\nCantidad de dardos dentro: " + dardosDentro + "\nValor de Pi: " + valorPi);
        scan.close();
    }
}