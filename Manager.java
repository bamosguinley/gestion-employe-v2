public class Manager extends Employee{
    String nbrPersonne;

    public Manager() {
        this.poste = "manager";
    }
    public String getNbrPersonne() {
        return this.nbrPersonne;
    }

    public void setNbrPersonne(String nbrPersonne) {
        this.nbrPersonne = nbrPersonne;
    }

    public void getDetails() {
        System.out.println("Id: " + this.getId());
        System.out.println("Nom: " + this.getNom());
        System.out.println("Poste: " + this.getPoste());
        System.out.println("Nombre de personnes a charge: " + this.getNbrPersonne());
        System.out.println("Salaire: " + this.getSalaire());
    }
}
