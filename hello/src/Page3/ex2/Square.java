package Page3.ex2;

import Page3.ex1.Rectangle;

public class Square extends Rectangle {
    int angleA;
    int angleB;
    int angleC;
    int angleD;

    public Square(int Longueur, int Largeur, int angleA, int angleB, int angleC, int angleD) {
        super(Longueur, Largeur); // On utilise super pour faire appel aux valeurs du parent.

        // Les angles de tous les côtés d'un carré sont toujours de 90 degrés
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
        this.angleD = angleD;
    }

    public void Affichersquare() {
        // On vérifie si les angles sont tous de 90 degrés et si la longueur est égale à la largeur
        if (angleA == 90 && angleB == 90 && angleC == 90 && angleD == 90 && Longueur == Largeur) {
            System.out.println("Ce rectangle est un carré aux angles égaux de 90°");
        } else {
            System.out.println("Ce n'est pas un carré !");
        }
        //PS: je m'étais dit que si c'était pas un carré, ce serait bien de pouvoir lui retirer la classe en plus de se plaindre, mais j'ai pas trouvé comment faire.
    }

    public static void main(String[] args) {
        // Création d'un objet
        Square square1 = new Square(20, 20, 90, 90, 90, 90);

        // Utilisation des méthodes
        square1.surface();
        square1.afficherrect();
        square1.Affichersquare();
    }
}