package Page1;
public class ex1 {

    //Ici, on crée la chaîne de caractère qui sera renversée.
    static String letruc = "truc";
    public static void main(String[] args) throws Exception {

        //Ici, on la présente à l'endroit.
        System.out.println (letruc);

        //On fait appel au stringBuilder grace auquel on accèdera à reverse qui permettra de changer la valeur letruc.
        StringBuilder letsreverse = new StringBuilder(letruc);
        letruc = letsreverse.reverse().toString();

        //Et on affiche le résultat du renversement.
        System.out.println (letruc);

    }
}
