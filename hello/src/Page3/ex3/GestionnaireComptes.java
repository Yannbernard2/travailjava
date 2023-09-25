//En dépit de plusieurs tentatives, cet exercice n'est pas réussi.

package Page3.ex3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionnaireComptes {
    private List<CompteBancaire> comptes;

    public GestionnaireComptes() {
        comptes = new ArrayList<>();
    }

    // Méthode pour charger les comptes à partir du fichier
    public void chargerComptes() {
        String cheminFichier = "C:\\Users\\don\\Desktop\\travauxjava\\hello\\src\\Page3\\ex3\\Comptes\\Comptes.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                String[] infos = ligne.split(";");
                if (infos.length == 4) {
                    int id = Integer.parseInt(infos[0]);
                    String nomClient = infos[1];
                    double solde = Double.parseDouble(infos[2]);
                    double plafond = Double.parseDouble(infos[3]);
                    CompteBancaire compte = new CompteBancaire(id, nomClient, solde, plafond);
                    comptes.add(compte);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}



public class Main {
    public static void main(String[] args) {
        GestionnaireComptes gestionnaire = new GestionnaireComptes();
        gestionnaire.chargerComptes();

        // Effectuer des opérations sur les comptes
        gestionnaire.effectuerRetrait(1, 100.0);
        gestionnaire.effectuerDepot(2, 200.0);

        // Afficher les informations des comptes
        gestionnaire.afficherInfos();
    }
}
