package page2;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;

public class ex7 {
    public static void main(String[] args) {

        // D'abord il faut créer un objet scanner pour rentrer le titre et le texte.
        try (Scanner scan = new Scanner(System.in)){
            PrintWriter printWriter = null;
            System.out.println("Veuillez rentrer le titre voulu pour votre fichier.");
            String title = scan.nextLine();
            System.out.println("Veuillez rentrer le texte que vous voulez inclure dans votre fichier.");
            String textToWrite = scan.nextLine();
            
                //On crée un printwriter dans le scanner, et on lui donne le titre comme titre.
                try {
                    printWriter = new PrintWriter(title);
                } 
                //On crée une marche à suivre dans le cas où le fichier est introuvable.
                catch (FileNotFoundException e) {
                    System.out.println("Unable to locate the fileName: " + e.getMessage());
                }
                //Et on écrit le texte dans le fichier avant d'arrêter la création.
                Objects.requireNonNull(printWriter).println(textToWrite);
                printWriter.close();
                System.out.println("Tout est bon, le fichier " + title + " existe !");
            
        }
    }

}
