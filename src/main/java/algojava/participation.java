package algojava;

import java.util.Scanner;

public class participation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double taux = 0.20;

        // Statut Marital
        System.out.println("Quel est le statut marital ?");
        String saisieUtilisateur = scanner.nextLine(); // récupération de la chaîne de caractère saisie par
                                                       // l'utilisateur
        char statutMarital = saisieUtilisateur.charAt(0); // indexation du premier caractère de la chaîne
        if (statutMarital == 'C') {
            taux = 0.20; // Célibataire
        } else {
            taux = 0.25; // Autre
        }
        System.out.println(taux);

        // Gestion des enfants
        System.out.println("Nombre d'enfant ?");
        int nbEnfant = scanner.nextInt();
        if (nbEnfant >= 1) {
            taux = taux + 0.15 * nbEnfant; // Java prend en compte les priorité oparatoire * avant + avant =
        }
        System.out.println(taux);

        // Le salaire dépasse-t-il 1800 € ?
        System.out.println("Quel est le salaire ?");
        int salaire = scanner.nextInt();
        if (salaire < 1800) {
            taux = taux + 0.10;
        }
        System.out.println(taux);

        // Plafond de 50%
        if (taux > 0.5) {
            taux = 0.5;
        }
        System.out.println(taux);

        scanner.close();

    }
}