package Page3.ex1;

public class Voiture {
    String Color;
    int Vitesse;

    // Constructeur
    public Voiture(String color, int vitesse) {
        this.Color = color;
        this.Vitesse = vitesse;
    }

    // Méthode pour rouler.
    public void rolling() {
        System.out.println("La voiture roule à une vitesse de " + this.Vitesse + " km/h.");
    }

    // Méthode pour afficher les détails
    public void afficher() {
        System.out.println("Couleur : " + this.Color);
        System.out.println("Vitesse : " + this.Vitesse + " km/h");
    }

    public static void main(String[] args) {
        // L'objet test
        Voiture car = new Voiture("Rouge", 100);

        // Vous commencez à connaître.
        car.rolling();
        car.afficher();
    }
}