package Page1;
import java.util.Random;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) throws Exception {
        //On génère une valeur number qui va servir plus tard. 
        int number = 101;
        //D'abord on utilise l'import random pour créer un objet Pifomètre pour génerer un chiffre entre 0 et 99. 
        Random pifomètre = new Random();
        try (Scanner scan = new Scanner(System.in)) {
            int answer = pifomètre.nextInt(100);
            
            
            //Ici tant que le chiffre du pifomètre et number sont pas égaux, la boucle dure. (Number à 101 peut pas être égal à un truc de 0 à 100)
            while (answer != number){
                //Et à partir de là on demande à l'utilisateur le chiffre en répétant et en conseillant.
            System.out.println("entrez un nombre entier");
            number = scan.nextInt();

            if (number > answer){
                System.out.println("redescends !");
            }

            else if (number < answer) {
                System.out.println("Plus haut !");
            }
        }
        System.out.println("en vrai bien joué.");

        }

        }
}
