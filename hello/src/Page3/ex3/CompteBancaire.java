//En dépit de plusieurs tentatives, cet exercice n'est pas réussi.

package Page3.ex3;

public class CompteBancaire {
    private int id;
    private String nomClient;
    private double solde;
    private double plafond;

    // Constructeur
    public CompteBancaire(int id, String nomClient, double solde, double plafond) {
        this.id = id;
        this.nomClient = nomClient;
        this.solde = solde;
        this.plafond = plafond;
    }

    // Méthode pour effectuer un retrait
    public void retrait(double montant) {
        if (montant > 0 && solde - montant >= plafond) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué avec succès.");
        } else {
            System.out.println("Opération de retrait impossible.");
        }
    }

    // Méthode pour effectuer un dépôt
    public void ajout(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué avec succès.");
        } else {
            System.out.println("Opération de dépôt impossible.");
        }
    }

    // Méthode pour afficher les informations du compte
    public void afficherInfos() {
        System.out.println("ID : " + id);
        System.out.println("Nom du client : " + nomClient);
        System.out.println("Solde : " + solde);
        System.out.println("Plafond : " + plafond);
    }

    public int getId() {
        return 0;
    }
}
