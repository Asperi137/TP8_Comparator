package jerome.outils;

import jerome.entite.Etudiant;

import java.util.Comparator;

/**
 * The type Compare etudiant.
 */
public class CompareEtudiant implements Comparator<Etudiant> {
    /**
     * le Comparateur etudiant et salarie.
     *
     * @param etu1
     * @param etu2
     * @return int
     */
    public int compare(final Etudiant etu1, final Etudiant etu2) {
        if (etu1.getNom().equalsIgnoreCase(etu2.getNom())) {
            if (etu1.getPrenom().equalsIgnoreCase(etu2.getPrenom())) {
                if (etu1.getAge() == etu2.getAge()) {
                    return 0;
                } else {
                    return etu1.getAge() - etu2.getAge();
                }
            } else {
                return etu1.getPrenom().compareTo(etu2.getPrenom());
            }
        } else {
            return etu1.getNom().compareTo(etu2.getNom());
        }
    }

}

