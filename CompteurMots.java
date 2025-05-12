import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompteurMots {
    public static void main(String[] args) {
        try {
            File fichier = new File("TestExercice3.txt"); // Nom du fichier à lire
            Scanner scanner = new Scanner(fichier);
            int totalMots = 0;

            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine(); // Lire une ligne
                String[] mots = ligne.split(" "); // Séparer en mots
                totalMots += mots.length; // Ajouter au compteur
            }

            scanner.close();
            System.out.println("Nombre total de mots : " + totalMots);
        } catch (FileNotFoundException e) {
            System.out.println("Erreur : Fichier non trouvé !");
        }
    }
}
