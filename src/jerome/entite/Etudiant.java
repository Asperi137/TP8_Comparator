package jerome.entite;

/**
 * The type Etudiant.
 */
public class Etudiant {
    /**
     * nom de l'étudiant.
     */
    private String nom;
    /**
     * prenom de l'étudiant.
     */
    private String prenom;
    /**
     * age de l'étudiant.
     */
    private int age;

    /**
     * Instantiates a new Etudiant.
     *
     * @param nomV    the nom
     * @param prenomV the prenom
     * @param ageV    the age
     */
    public Etudiant(final String nomV, final String prenomV, final int ageV) {
        setNom(nomV);
        setPrenom(prenomV);
        setAge(ageV);
    }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets nom.
     *
     * @param nomV the nom
     */
    public void setNom(final String nomV) {
        this.nom = nomV.toUpperCase();
    }

    /**
     * Gets prenom.
     *
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Sets prenom.
     *
     * @param prenomV the prenom
     */
    public void setPrenom(final String prenomV) {
        this.prenom = prenomV;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param ageV the age
     */
    public void setAge(final int ageV) {
        this.age = ageV;
    }

    /**
     * redef de equals.
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Etudiant)) {
            return false;
        }
        Etudiant etudiant = (Etudiant) o;
        return getAge() == etudiant.getAge()
                       && getNom().equals(etudiant.getNom())
                       && getPrenom().equals(etudiant.getPrenom());
    }

    /**
     * redef du hashcode.
     *
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 7;
        result = prime * result + getAge();
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
        return result;
    }

    /**
     * redef du toString.
     *
     * @return String
     */
    @Override
    public String toString() {
        return String.format("Etudiant : %s %s %s ans.",
                getNom(), getPrenom(), getAge());
    }
}

