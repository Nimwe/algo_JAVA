package algojava;
import java.util.Scanner; 


public class Factorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        
        System.out.println("Donner un entier : ");

        int n = scanner.nextInt(); 
        int fact = 1;

        for (int i = 1 ; i <= n ; i++) {
            fact *=i;
            System.out.println("La donnée d'entrée est :" + n + ". n! de " + n +" est : " + fact + ".") ;
        }

        scanner.close() ;
    } 
}
