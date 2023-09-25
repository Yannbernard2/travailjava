package Page1;
import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) throws Exception {

        //On crée d'abord un objet Scanner. Il va servir ci-dessous à rentrer la hauteur et le caractère voulu.
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("entrez le caractère que vous voulez.");
            String cara = scan.nextLine();
            
            System.out.println("Et la hauteur ?");
            int high = scan.nextInt();

            //On déclare une valeur count pour une boucle, qui continuera tant que count sera inférieur à la hauteur voulue.
            for (int count = 0; count < high; count++ ){

                //On fait un jeu d'espaces pour que la pyramide soit équilibrée, et on met des boucles dans notre boucle à hauteur pour faire l'horizontal.
                for (int space = 0; space < high -count ;space++) {
                    System.out.print(" ");
                }
                for (int write = 0; write <= count; write++) {
                    System.out.print(cara + " ");
                }
                System.out.println("");
            }
        }
            
        

    }
}
