package page2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            //On déclare un compte à zéro, et on demande d'entrer une phrase.
            int count = 0;
            System.out.println("entrez une phrase de votre choix SANS DOUBLE ESPACE.");
            String tocount = scan.nextLine();

            //Là, on crée un objet words qui comptera les mots de tocount en comptant les espaces.
            String[] words = tocount.split(" ");
            //En gros on fait que pour chaque mot qui passe dans words, on ajoute + 1 à count
            for (String solo : words) {
                //Aussi, on affiche les mots un par un des fois que l'utilisateur puisse repérer une erreur.
                System.out.println(solo);
                count = count + 1; 
            }
            //Ce If là c'est parce que gramaticalement, y'a un espace avant un ! ou ?. Or comme on compte les espaces, on doit faire une soustraction pour pas fausser le count.
            if (tocount.contains("!")){
                    count = count - 1;
            }
            else if (tocount.contains("?")){
                    count = count - 1;
            }
            //Et voilà le résultat avec un saut de ligne. 
            System.out.println(" ");
            System.out.println("Cette phrase compte " + count + " mots énumérés ci dessus. (une apostrophe ne compte pas comme deux mots.)");
            
            
        }

        }
}
