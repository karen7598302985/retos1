import java.util.Random;
import java.util.Scanner;
public class reto3 {

    public static void main(String[] args) {
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
        System.out.println("Por favor escoja 1.cara 2. Sello ");
        int eleccion;
        
        eleccion = lectura.nextInt();
        Random moneda= new Random();
        int N = 1 +  moneda.nextInt(2);
        
        if (eleccion==1 && N==1){
            System.out.println("En la moneda salio " + N + " Y tu elegiste " + eleccion);
            System.out.println("Gano");

            }else if (eleccion ==2 && N==2){
                System.out.println("Recuerda que 1 es cara y 2 es sello");
                System.out.println("En la moneda salio " + N + " Y tu elegiste " + eleccion);
                System.out.println("Gano");

                }else {
                    System.out.println("En la moneda salio " + N + " Y usted escojio " + eleccion);
                    System.out.println("Perdió");
                    }
        
        lectura.close();
    }
    
}
