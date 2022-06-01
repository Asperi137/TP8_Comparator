package jerome.entite;

/**
 * The type Salarie.
 */
public class Salarie extends Etudiant {
    /**
     * identifiant du salarie.
     */
    private int identifiant;

    /**
     * Instantiates a new Salarie.
     *
     * @param nomV         the nom
     * @param prenomV      the prenom
     * @param ageV         the age
     * @param identifiantV the identifiant
     */
    public Salarie(final String nomV,
                   final String prenomV,
                   final int ageV,
                   final int identifiantV) {
        super(nomV, prenomV, ageV);
        setIdentifiant(identifiantV);
    }

    /**
     * Gets identifiant.
     *
     * @return the identifiant
     */
    public int getIdentifiant() {
        return identifiant;
    }

    /**
     * Sets identifiant.
     *
     * @param identifiantV the identifiant
     */
    public void setIdentifiant(final int identifiantV) {
        this.identifiant = identifiantV;
    }

    /**
     * redef de equals.
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(final Object o) {
        boolean result = false;
        if (this == o) {
            result = true;
        } else if (o instanceof Salarie && super.equals(o)) {
            Salarie salarie = (Salarie) o;
            result = getAge() == salarie.getAge()
                             && getNom().equals(salarie.getNom())
                             && getPrenom().equals(salarie.getPrenom())
                             && getIdentifiant() == salarie.getIdentifiant();
        }

        return result;
    }

    /**
     * redef du hashcode.
     *
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + getIdentifiant();
        return result;
    }

    /**
     * redef du toString.
     *
     * @return String
     */
    @Override
    public String toString() {
        String etu = String.format("Salarié N°%s : %s %s %s ans.",
                getIdentifiant(), getNom(), getPrenom(), getAge());
        return etu;
    }
}
