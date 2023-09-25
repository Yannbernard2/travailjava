package Page1;
public class ex3 {
    static int lownumber = 1;
    static int highnumber = 10000;
    static int result = 0;


    public static void main(String[] args) throws Exception {

        //Ici on a déclaré 1 et 10000. On additionne l'un à l'autre et on ajoute le résultat dans result.
        while (lownumber <= highnumber){
            result = result + lownumber + highnumber;
            //Et on rapproche les deux valeurs de 1 chacune jusqu'à ce qu'elles soient égales.
            lownumber = lownumber + 1;
            highnumber = highnumber - 1;
        }

        System.out.println ("Le résultat est " + result);
    }
    
}
