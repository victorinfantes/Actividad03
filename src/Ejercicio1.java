import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //A.Pida por consola numeros enteros hasta que se introduzca -1 y al final del proceso
        //muestra todos los numeros introducidos por pantalla
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> multiplos = new ArrayList<>();
        while (numero != -1) {
            System.out.println("Introduce un numero");
            lista.add(numero);
            numero = sc.nextInt();
        }
        System.out.println("Lista completa");
        System.out.println(lista);
        System.out.println("Numeros pares :");
        for (Integer p : lista) {
            if (p % 2 == 0) {
                System.out.println(p);
            }
            if (p % 3 == 0) {
                multiplos.add(p);
            }

        }
        System.out.println("Multiplos de 3 :");
        System.out.println(multiplos);


    }
}
