import java.util.Scanner;

public class reto4 {
    public static void main(String args[]) {
        Scanner lectura = new Scanner(System.in);
        String nombre;
        int valorapuesta;

        System.out.print("Ingrese su nombre:");
        nombre=lectura.nextLine();
         
        System.out.print("cuanto quieres apostar: ");
        valorapuesta=lectura.nextInt();

        if (valorapuesta < 10000) {
            System.out.println("Su apuesta tiene que ser mayor a 10.000");
            return;
        }
        int selecCompu = (int)(Math.random() * 3) + 1;
        
 
        System.out.print("Digite 1 si es piedra, 2 si es papel,3 si es tijera: ");
        int selecUsuario = lectura.nextInt();
 
        System.out.print("La computadora habia escogido: ");
        switch ( selecCompu )
        {
            case 1:
                System.out.println("Piedra");
                switch ( selecUsuario )
                {
                   case 1: System.out.println("Empate"); 
                   break;
                   case 2: System.out.println("Usted gana"); 
                   break;
                   case 3: System.out.println("La computadora gana");
                    break;

                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( selecUsuario )
                {
                   case 1: System.out.println("La computadora gana");
                    break;
                   case 2: System.out.println("Empate"); 
                   break;
                   case 3: System.out.println("Usted gana");
                    break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( selecUsuario )
                {
                   case 1: System.out.println("Usted gana");
                   break;
                   case 2: System.out.println("La computadora gana"); 
                   break;
                   case 3: System.out.println("Empate"); 
                   break;
                }
                break;
        }
        lectura.close();
    }
}
