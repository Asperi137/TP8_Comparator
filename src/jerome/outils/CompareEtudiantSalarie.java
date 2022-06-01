package jerome.outils;

import jerome.entite.Etudiant;
import jerome.entite.Salarie;

/**
 * The type Compare etudiant salarie.
 */
public class CompareEtudiantSalarie extends CompareEtudiant {

    /**
     * le Comparateur etudiant et salarie.
     *
     * @param etu1
     * @param etu2
     * @return int
     */
    @Override
    public int compare(final Etudiant etu1, final Etudiant etu2) {
        int result = -1;
        if (!(etu1 instanceof Salarie) || (etu2 instanceof Salarie)) {
            if (!(etu1 instanceof Salarie) && (etu2 instanceof Salarie)) {
                result = +1;
            } else if (etu1 instanceof Salarie && etu2 instanceof Salarie) {
                if (((Salarie) etu1).getIdentifiant() > ((Salarie) etu2).getIdentifiant()) {
                    result = +1;
                }
            } else if (etu1.getNom().equalsIgnoreCase(etu2.getNom())) {
                if (etu1.getPrenom().equalsIgnoreCase(etu2.getPrenom())) {
                    if (etu1.getAge() == etu2.getAge()) {
                        result = 0;
                    } else {
                        result = etu1.getAge() - etu2.getAge();
                    }
                } else {
                    result = etu1.getPrenom().compareTo(etu2.getPrenom());
                }
            } else {
                result = etu1.getNom().compareTo(etu2.getNom());
            }
        }
        return result;
    }

}
