package algojava;

public class Application {

    /*
     * public static void main(String[] args) {
     * System.out.println("Hello World!");
     */

    public static void main(String[] args) {

        int actualYear = 2025;
        int birthYear = 2023;
        int age = actualYear - birthYear;

        if (age >= 18) {
            System.out.println("Vous êtes né avant 2007, vous êtes majeur");
        } else {
            System.out.println("Vous n'êtes pas né avant 2007, vous n'êtes pas majeur");
        }
    }

}
