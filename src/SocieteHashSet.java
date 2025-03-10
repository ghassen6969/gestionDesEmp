import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SocieteHashSet implements IDepartement<Departement> {

    Set<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {

        for (Departement d : departements) {
            if (d.getNom().equals(nom))
                return true;
        }

        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(departements);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {

        TreeSet<Departement> tree = new TreeSet<>(new ComparatorParId());
        tree.addAll(departements);
        return tree;
    }
}