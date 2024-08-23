public abstract class Employee {
    protected int id;
    protected String nom;
    protected String poste;
    protected double salaire;

    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPoste() {
        return this.poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public double getSalaire() {
        return this.salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    
    public void getDetails() {
        System.out.println("details");
    }
    
}

