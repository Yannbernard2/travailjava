//En dépit de plusieurs tentatives, cet exercice n'est pas réussi.

package Page3.ex3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;



public class Compte extends Personne {
    int ID;
    String Password;
    int Money;
    int Plafond;

    // Constructeur de la classe
    public Compte(int ID, int Money, String Password, int Plafond, String nom, int age) {
        super(nom, age);
        // Initialisation des champs
        this.ID = ID;
        this.Password = Password;
        this.Money = Money;
        this.Plafond = Plafond;
        
    }

    // Méthode pour faire rouler la voiture
    public void createaccount() {
        PrintWriter printWriter = null;
        try {
            
                printWriter = new PrintWriter(nom + ID);
            } catch (FileNotFoundException e) {
                    System.out.println("Unable to locate the fileName: " + e.getMessage());
                }
                Objects.requireNonNull(printWriter).println(Money);
                Objects.requireNonNull(printWriter).println(Password);
                Objects.requireNonNull(printWriter).println(Plafond);
                printWriter.close();
                System.out.println("Tout est bon, le fichier " + nom + " existe !");
            
    }

    // Méthode pour afficher les détails de la voiture
    public void affichercompte() {
        System.out.println("ID : " + this.ID );
        System.out.println("Password : " + this.Password);
        System.out.println("Money : " + this.Money + " €");
        System.out.println("Plafond : " + this.Plafond + " €");
    }

    public static void main(String[] args) {
        // Création d'un objet Voiture
        Compte compte1 = new Compte(0, 2000, "Vuii", 200, "Jacques", 20);

        // Utilisation des méthodes de l'objet
        
        compte1.affichercompte();
        compte1.afficherpers();
        compte1.createaccount();
    }
    
}
