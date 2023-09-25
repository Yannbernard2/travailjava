package Page3.ex1;

public class Utilisateur {
    String nom;
    int age;

    // Constructeur
    public Utilisateur(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthode parler.
    public void parler() {
        System.out.println("Salut moi c'est " + this.nom + " ! Et toi ?");
    }

    // Méthode pour tous les détails.
    public void afficher() {
        System.out.println("nom : " + this.nom);
        System.out.println("age : " + this.age + " ans");
    }

    public static void main(String[] args) {
        // Création de l'objet test.
        Utilisateur utilisateur1 = new Utilisateur("Robert", 30);

        // On balance les méthodes.
        utilisateur1.parler();
        utilisateur1.afficher();
    }
}
