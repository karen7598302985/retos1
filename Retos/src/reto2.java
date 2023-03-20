import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) {
        String mama;
        int pesobbe=0;
        int mesbebe=0;
        int dosis=0;
       
      

        try (Scanner leer = new Scanner(System.in)){
            System.out.println("Ingrese el nombre de la mama: ");
            mama = leer.nextLine();
            System.out.println("Ingrese el peso del bebé: ");
            pesobbe = leer.nextInt();
           
            System.out.println("Ingrese la edad del bebé (meses): ");
            mesbebe = leer.nextInt();
           
            dosis = ((mesbebe*10)/(pesobbe+10) * 8);
            System.out.println(mama + " La dosis adecuada para tu bebe es: " + dosis);
  
            leer.close();
        }
    }
    
}