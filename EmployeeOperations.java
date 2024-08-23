import java.util.ArrayList;
public interface EmployeeOperations {
    public void createEmploye(Employee em);

    public void getAllEmploye(ArrayList<Employee> employes);

    public void getOneEmploye(ArrayList<Employee> employes, int identifiant);

    public void updateEmploye(ArrayList<Employee> employes, int identifiant);

    public void deleteEmploye(ArrayList<Employee> employes, int identifiant);


}
