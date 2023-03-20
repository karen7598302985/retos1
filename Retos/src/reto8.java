import java.util.Scanner;
import java.util.Random;

public class reto8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Random random = new Random();
        int numeroAdiv = random.nextInt(100) + 1;
        boolean acierto = false;
        int intentos = 0;
        System.out.println("Tienes 10 intentos para adivinar un número entre 1 y 100.");
        
       
        while (!acierto && intentos < 10) {
            System.out.print("Introduce tu número: ");
            int numeroUsu = leer.nextInt();
            intentos++;

            if (numeroUsu == numeroAdiv) {
                acierto = true;
                System.out.println("lo lograste adivinaste tu número de " + intentos + " intentos.");
            } else if (numeroUsu < numeroAdiv) {
                System.out.println("El número a adivinar es mayor que " + numeroUsu);
            } else {
                System.out.println("El número a adivinar es menor que " + numeroUsu);
            }
        }

        if (!acierto) {
            System.out.println("no lograste adivinar el número. El número era " + numeroAdiv);
        }

        leer.close();
    }

}
