public class Developer extends Employee{
    String specialite;

    public Developer() {
        this.poste = "developper";
    }
    public String getSpecialite() {
        return this.specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void getDetails() {
        System.out.println("Id: " + this.getId());
        System.out.println("Nom: " + this.getNom());
        System.out.println("Poste: " + this.getPoste());
        System.out.println("Specialite: " + this.getSpecialite());
        System.out.println("Salaire: " + this.getSalaire());
    }
}
