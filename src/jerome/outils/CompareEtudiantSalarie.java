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
        if (!(etu1 instanceof Salarie) && (etu2 instanceof Salarie)) {
            return +1;
        } else if (etu1 instanceof Salarie && etu2 instanceof Salarie) {
            return (((Salarie) etu1).getIdentifiant() - ((Salarie) etu2).getIdentifiant());
        } else return super.compare(etu1, etu2);
    }

}
