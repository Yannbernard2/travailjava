//En dépit de plusieurs tentatives, cet exercice n'est pas réussi.

package Page3.ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Actions {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
		
            try {
                System.out.println("Fichier trouvé \n");

                
                
                System.out.println("Rentrez 1 si vous voulez lire le contenu du fichier. 2 si vous voulez compter les mots, n'importe quoi d'autre si vous voulez arrêter le programme.");
                int command = scan.nextInt();
                while (command == 1 || command == 2){
                    FileReader filereader = new FileReader("C:\\Users\\don\\Desktop\\travauxjava\\hello\\src\\Page3\\ex3\\Comptes");
                        
                        BufferedReader reader = new BufferedReader(filereader);
                        
                        
                        String line = reader.readLine();
                    
                    if (command == 1){
                        
                        
                        while (line != null) {
                            // affichage de la ligne
                            System.out.println(line);
                            // lecture de la prochaine ligne
                            line = reader.readLine(); 
                        }
                        reader.close();
                    }
                    else if (command == 2){
                        
                        int count = 0;
                        String[] words = line.split(";");
                        for (String solo : words) {
                            System.out.println(solo);
                            count = count + 1; 
                        }
                        if (line.contains("!")){
                                count = count - 1;
                        }
                        else if (line.contains("?")){
                                count = count - 1;
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
