package jerome.app;

import jerome.entite.Etudiant;
import jerome.entite.Salarie;
import jerome.entite.Societe;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Societe societe = new Societe();
        Salarie durand = societe.recruter(new Etudiant("Durand", "Michel", 55));
        Salarie leclerc = societe.recruter(new Etudiant("Leclerc", "Claude", 50));
        Salarie mercier = societe.recruter(new Etudiant("Mercier", "Paul", 38));
        Salarie dubois = societe.recruter(new Etudiant("Dubois", "Paul", 38));
        Salarie martin = societe.recruter(new Etudiant("Martin", "Catherine", 21));
        Salarie charpentier = societe.recruter(new Etudiant("Charpentier", "Pierre", 25));
        Salarie vannier = societe.recruter(new Etudiant("Vannier", "Guillaume", 38));
        Salarie rodriguez = societe.recruter(new Etudiant("Rodriguez", "Isabelle", 25));
        societe.congedier(vannier);
        societe.congedier(martin);
        Salarie duval = societe.recruter(new Etudiant("Duval", "Isabelle", 30));
//        societe.afficher(true);
        societe.congedier(duval);
//        societe.afficher(true);
        Salarie duval2 = societe.recruter(new Etudiant("Duval", "Isabelle", 30));
        societe.afficher(true);
//        societe.afficher(false);
    }
}
