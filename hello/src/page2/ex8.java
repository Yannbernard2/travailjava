package page2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ex8 {


public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
		
            try {
                
                System.out.println("Veuillez écrire le chemin pour accéder au fichier que vous désirez.");

                String path = scan.nextLine();

                
                File file = new File(path);

                
                //Ici on place un if et une boucle au cas où le chemin est mal donné, et le message d'erreur dure tant que l'utilisateur se foire.
                if (file.exists() == false){
                    while (file.exists() == false){
                        System.out.println(" \n Erreur. Vous avez dû mal rentrer le cheminement. Veuillez rentrer le cheminement à nouveau. \n");
                        path = scan.nextLine();
                        file = new File(path);
                    }                    
                }

                System.out.println("Fichier trouvé \n");

                
                
                System.out.println("Rentrez 1 si vous voulez lire le contenu du fichier. 2 si vous voulez compter les mots, n'importe quoi d'autre si vous voulez arrêter le programme.");
                int command = scan.nextInt();
                while (command == 1 || command == 2){
                    //On crée un Filereader pour lire le fichier.
                    FileReader filereader = new FileReader(path);

                        // Ensuite on crée un bufferedReader qui utilise le fileReader
                        BufferedReader reader = new BufferedReader(filereader);
                        
                        // Et on donne à la valeur line ce qui est lu.
                        String line = reader.readLine();
                    
                    if (command == 1){
                        
                        //Là on affiche line tant que line n'est pas vide, ligne par ligne.
                        while (line != null) {
                            
                            System.out.println(line);
                            
                            line = reader.readLine();
                        }
                        reader.close();
                    }
                    else if (command == 2){
                        
                        //Là on réutilise le compteur de l'exercice 6 pour compter les mots.
                        int count = 0;
                        String[] words = line.split(" ");
                        for (String solo : words) {
                            System.out.println(solo);
                            count = count + 1; 
                        
                        if (line.contains("!")){
                                count = count - 1;
                        }
                        else if (line.contains("?")){
                                count = count - 1;
                        }
                        }
                        System.out.println(" ");
                        System.out.println("Ce fichier compte " + count + " mots énumérés ci dessus. (une apostrophe ne compte pas comme deux mots.)");
                    }
                    System.out.println("1: lire / 2: compter les mots / Autres nombres: quitter");
                    command = scan.nextInt();
                }
                
                System.out.println("Le programme va s'arrêter.");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
    
}
