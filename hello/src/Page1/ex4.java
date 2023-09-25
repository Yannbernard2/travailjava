package Page1;
import java.util.Scanner;

public class ex4 {
    
    

    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            //Très simple. L'utilisateur rentre son nombre via un scan
            System.out.println("entrez un nombre entier");
            float number = scan.nextFloat();
            //On divise par deux, puis on fait un modulo 1 pour voir si y'a un nombre après la virgule. Oui: impair, Non: pair.
            if (number / 2 % 1 == 0){
            System.out.println("Le nombre " + number + " est pair !");
            }

            else{
                System.out.println("Le nombre " + number + " est impair !"); 
            }
        }

        }

        
    
    
}