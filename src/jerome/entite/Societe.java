package jerome.entite;

import jerome.outils.CompareEtudiant;
import jerome.outils.CompareEtudiantSalarie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * The type Societe.
 */
public class Societe {
    /**
     * numero du Dernier Arrive.
     */
    private int numDernierArrive;
    /**
     * liste du Personnel.
     */
    private ArrayList<Etudiant> listePersonnel;

    /**
     * Instantiates a new Societe.
     */
    public Societe() {
        this.listePersonnel = new ArrayList<Etudiant>();
        numDernierArrive = 1;
    }

    /**
     * Recruter salarie.
     *
     * @param etu the etu
     * @return the salarie
     */
    public Salarie recruter(final Etudiant etu) {
        Salarie sal = null;
        if (etu != null) {
            sal = new Salarie(etu.getNom(),
                    etu.getPrenom(),
                    etu.getAge(),
                    numDernierArrive);
            if (!(etu instanceof Salarie) && listePersonnel.contains(etu)) {
                listePersonnel.remove(etu);
                listePersonnel.add(sal);
                numDernierArrive += 1;
            } else if (!listePersonnel.contains(etu)) {
                listePersonnel.add(sal);
                numDernierArrive += 1;
            }
        }
        return sal;
    }

    /**
     * Congedier.
     *
     * @param employe the employe
     */
    public void congedier(final Salarie employe) {
        String mess;
        if (employe != null) {
            listePersonnel.add(new Etudiant(employe.getNom(),
                    employe.getPrenom(),
                    employe.getAge()));
            listePersonnel.remove(employe);
            mess = String.format("%s %s %s quitte l'entreprise.",
                    employe.getNom(), employe.getPrenom(), employe.getAge());
        } else {
            mess = "personne ne quitte l'entreprise.";
        }
        System.out.println(mess);
    }

    /**
     * Afficher.
     */
    public void afficher() {
        Iterator ite = listePersonnel.iterator();
        String text = "----------------\n";
        while (ite.hasNext()) {
            text += ite.next() + "\n";
        }
        text += "----------------";
        System.out.println(text);
    }

    /**
     * Afficher.
     *
     * @param ordre the ordre
     */
    public void afficher(final boolean ordre) {
        Comparator comparateur = ordre ? new CompareEtudiantSalarie()
                                         : Collections.reverseOrder(new CompareEtudiantSalarie());
        Collections.sort(listePersonnel, comparateur);
        Iterator ite = listePersonnel.iterator();
        String text = "----------------\n";
        while (ite.hasNext()) {
            text += ite.next() + "\n";
        }
        text += "----------------";
        System.out.println(text);

    }

    /**
     * Trier.
     */
    public void trier() {
        CompareEtudiant compar = new CompareEtudiant();
        Collections.sort(listePersonnel, compar);
    }

}
