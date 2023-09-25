package Page3.ex1;

public class Rectangle {
    public int Longueur;
    public int Largeur;
    int Surface;

    // Ici le constructeur.
    public Rectangle(int Longueur, int Largeur) {
        this.Longueur = Longueur;
        this.Largeur = Largeur;
    }

    // Ici on crée la méthode surface pour calculer... Bah la surface.
    public void surface() {
        int Surface = Longueur * Largeur;
        this.Surface = Surface;
        System.out.println("Le rectangle a une surface de " + this.Surface + " cm carrés.");
    }

    // Et là la méthode afficherrect pour tout afficher du rectangle.
    public void afficherrect() {
        System.out.println("Longueur : " + this.Longueur + " cm");
        System.out.println("Largeur : " + this.Largeur + " cm");
        System.out.println("Surface : " + this.Surface + " cm carrés");
    }

    //On crée un rectangle et on balance les méthodes.
    public static void main(String[] args) {
        // Création d'un objet Voiture
        Rectangle rectangle1 = new Rectangle(30, 20);

        // Utilisation des méthodes de l'objet
        rectangle1.surface();
        rectangle1.afficherrect();
    }
}
