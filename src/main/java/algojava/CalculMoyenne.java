package algojava;

public class CalculMoyenne {
    // array int
    // moyenne des valeures
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        System.out.println(" La moyenne est : " + moyenne(array));

    }

    /**
     * Fonction de somme et de calcul de moyenne des valeurs d'un tableau
     * 
     * @param array
     * @return
     * 
     */
    public static int moyenne(int[] array) {

        if( array == null || array.length == 0) {
            System.out.println("Boom");
        }

        int somme = 0 ;
        for (int nb : array) {
            somme +=nb ;
        }
        return somme/array.length ;
    }

}
