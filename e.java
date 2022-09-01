
/*
EJERCICIO 2: Primes (MIT)
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class  e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantidad, i, num=2;
        boolean primo;
        // Entrada
        System.out.print("Bienvenido(a), ingrese la cantidad de números primos que desea imprimir: ");
        cantidad = scan.nextInt();
        scan.close();
        System.out.println("Estos son los números primos:");
        for (int cont = 1; cont <= cantidad; cont++) {
            primo = true;
            for (i = num - 1; i > 1; i--) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo){
                System.out.println(num+"\t");
            }
            num++;
        }

    }
}