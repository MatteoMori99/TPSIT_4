/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finestre1;
import java.util.Scanner;
/**
 *
 * @author Studente
 */
public class Finestre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    
        int n;
     
        Scanner input = new Scanner(System.in);
     
     do{
            System.out.println("Inserisci il numero delle finestre da inserire: ");
            n = input.nextInt();
        }while (n<=0);
     
     do{
         Finestra f1;
        f1 = new Finestra();
        f1.setVisible(true);
        n = n-1;
     }while(n!=0);
    
    
    }
}
