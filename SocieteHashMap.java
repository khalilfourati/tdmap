import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {
    private Map<Employe, Departement> employes;

    public SocieteHashMap() {
        this.employes = new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employes.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        employes.forEach((e, d) -> System.out.println(e + " -> " + d));
    }

    @Override
    public void afficherLesEmployes() {
        employes.keySet().forEach(System.out::println);
    }

    @Override
    public void afficherLesDepartements() {
        employes.values().stream().distinct().forEach(System.out::println);
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement d = employes.get(e);
        if (d != null) {
            System.out.println(d);
        } else {
            System.out.println("Aucun département trouvé pour cet employé.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return employes.containsValue(d);
    }
}
