import java.util.Scanner;
public class reto1 {
    public static void main(String[] args) {
        double gradosF=0;
        double gradosC=0; 
        try (Scanner leer = new Scanner (System.in)){
        System.out.println("Ingrese la temperatura fahrentheit: ");
        gradosF = leer.nextDouble();
        gradosC = ((gradosF - 32) / 1.8);
        System.out.println("En grados centigrados esto es: "+ gradosC);

        }
    }
    
}