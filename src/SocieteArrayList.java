import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> employes = new ArrayList<>();



    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        employes.forEach(System.out::println);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override


    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes,
                new ComparatorParDepartement()
                        .thenComparing(new ComparatorParGrade()));
    }
}
