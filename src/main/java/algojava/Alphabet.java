package algojava;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] voyelle = { 'a', 'e', 'i', 'o', 'u', 'y' };

        for (int ia = 0; ia < alphabet.length; ia++) {
            boolean isVoyelle = false;

            for (int iv = 0; iv < voyelle.length && !isVoyelle; iv++) {

                if (alphabet[ia] == voyelle[iv]) {
                    System.out.println(alphabet[ia] + " = V");
                    isVoyelle = true;
                }
            }

            if (isVoyelle == false) {
                System.out.println(alphabet[ia] + " = C");
            }
        }
    }
                                              
                                      // Optimisé JAVA (par Ludovic)
                                      
    /**
     * Vérifie si un caractère passé en paramètre est une voyelle
     * 
     * @param caractereAVerif Caractère à vérifier
     * @return 'V' si voyelle, 'C' si consonne
     */
    public static char isVoyelle(char caractereAVerif) {

        if (caractereAVerif == 'a' ||
                caractereAVerif == 'e' ||
                caractereAVerif == 'i' ||
                caractereAVerif == 'o' ||
                caractereAVerif == 'u' ||
                caractereAVerif == 'y') {
            return 'V';
        }

        return 'C';
    }

}
