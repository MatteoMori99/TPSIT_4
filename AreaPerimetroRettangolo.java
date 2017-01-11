
package areaperimetrorettangolo;
import java.util.Scanner;

public class AreaPerimetroRettangolo {
    public static void main(String[] args) {
        int lato;
        int altezza;
        
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Inserisci il lato: ");
            lato = input.nextInt();
        }while (lato<=0);
       
        do{
        System.out.println("Inserisci l'altezza: ");
        altezza = input.nextInt();
        }while (altezza<=0);
        
        int area = lato*altezza;
        System.out.println("Area"+area); 
        
        int perimetro = (lato+altezza)*2;
        System.out.println("Perimetro"+perimetro); 
        
       
        
    }
    
}

   