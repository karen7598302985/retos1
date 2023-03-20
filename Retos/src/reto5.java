import java.util.Scanner;
public class reto5 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);

        int precio;
        int cantidad;
        int total=0;
       
for( int x=1; x<=5; x++){
System.out.println("Digite el precio del producto:");
precio=lectura.nextInt();
System.out.println("Digite la cantidad del producto:");
cantidad=lectura.nextInt();
total += cantidad * precio;

}
System.out.println("el precio total es: " + total);



lectura.close();
    }
    
    
    
}