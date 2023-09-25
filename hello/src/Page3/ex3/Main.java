//En dépit de plusieurs tentatives, cet exercice n'est pas réussi.

package Page3.ex3;

public class Main {
    public static void main(String[] args) {
        GestionnaireComptes gestionnaire = new GestionnaireComptes();
        gestionnaire.chargerComptes("Comptes.txt"); // Assurez-vous que le fichier "Comptes.txt" existe

        // Effectuer des opérations sur les comptes
        gestionnaire.effectuerRetrait(1, 100.0);
        gestionnaire.effectuerDepot(2, 200.0);

        // Afficher les informations des comptes
        gestionnaire.afficherInfosComptes();
    }
}
