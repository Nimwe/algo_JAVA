package algojava;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.Arrays;  => Utiliser pour la version avec outils

/* Exemple pour comprendre la fonction swap 
=> utilisable qu'avec une list, chaine, ou objet 
!! Il faut importer la java.util.* pour utiliser cette fonction

public class SwapFunction {

    public static <T> void swapElements(ArrayList<T> list, int index1, int index2) {
        Collections.swap(list, index1, index2);         => Collections.swap ne fonctionne qu'avec des listes

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList <>(Arrays.asList("Apple", "Banana","Orange", "kiwi")) ;
            System.out.println("Before Swap : " + list); 
            swapElements(list, 1,2) ;
            System.out.println(("After Swap : " + list));
    }
}*/

public class Echange_valeur {

    public static void main(String[] args) {
        /* En utilisant les outils java  :

         * ArrayList<String> list = new ArrayList <> (Arrays.asList ( "4", "155", "2",
         * "6" ));
         * System.out.println("Before swap : " + list);
         * swapElements(list, 1,3);
         * System.out.println("After swap : " + list);
         */

        // Avec la fonction manuelle
        int[] array = { 4, 6, 2, 155 };
        swap(array, 1, 3);
        System.out.println();
        displayContent(array);  
    }

    public static <T> void swapElements(ArrayList<T> list, int index1, int index3) {
        Collections.swap(list, index1, index3);
    }

    /**
     * Fonction swap manuelle
     * 
     * @param array
     * @param index1
     * @param index2
     * @return
     * 
     */
    public static boolean swap(int[] array, int index1, int index2) {

        if (index1 > array.length && index1 < 0 && index2 > array.length && index2 < 0 && array.length < 2) {
            System.out.println("Boum");
        }

        int temp = array[index1];

        array[index1] = array[index2];
        array[index2] = temp;

        return true;
    }

    // Normalement c'est une procedure car ne renvoie rien, fait juste un affichage,
    // ce n'est pas une fonction
    // mais par abus de langage c'est aussi appelé une fonction
    public static void displayContent(int[] displayArray) {
        for (int i = 0; i < displayArray.length; i++) {
            System.out.println(displayArray[i]);
        }
    }

}