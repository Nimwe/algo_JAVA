package algojava;

import java.util.Scanner;

public class Compte {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ecrire le solde bancaire");
        float solde = scanner.nextFloat();
        System.out.println(solde);

        System.out.println("Ecrire le prix du produit");
        float prix = scanner.nextFloat();
        System.out.println(prix);

        scanner.close();

        float newSolde = solde - prix;

        if (solde > prix) {
            System.out.println("Vous pouvez acheter cet article - il vous restera : " + newSolde + " euros.");
        } else {
            System.out.println("Vous n'avez pas le solde necessaire pour cet achat, veuillez alimenter votre compte");
        }
    }
}
