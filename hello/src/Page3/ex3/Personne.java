//En dépit de plusieurs tentatives, cet exercice n'est pas réussi.

package Page3.ex3;

public class Personne {
    String nom;
    int age;

    // Constructeur de la classe
    public Personne(String nom, int age) {
        // Initialisation des champs
        this.nom = nom;
        this.age = age;
    }

    // Méthode pour faire rouler la voiture

    // Méthode pour afficher les détails de la voiture
    public void afficherpers() {
        System.out.println("nom et prénom : " + this.nom);
        System.out.println("age : " + this.age + " ans");
    }

    public static void main(String[] args) {
        // Création d'un objet Voiture
        Personne personne1 = new Personne("Michael Jordan", 20);

        // Utilisation des méthodes de l'objet
        personne1.afficherpers();
    }
}
