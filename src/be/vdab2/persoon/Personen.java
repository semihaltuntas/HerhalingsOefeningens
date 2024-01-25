package be.vdab2.persoon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Personen implements Serializable {
    private List<Persoon> personenList = new ArrayList();
    private static final long serialVersionUID = 1L;
    public Personen(){
    }

    public Personen(List<Persoon> personenList) {
        this.personenList = personenList;
    }

    public void add(Persoon persoon) {
        personenList.add(persoon);
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        for (var persoon : personenList) {
            builder.append(persoon.toString()).append("\n");
        }
        return builder.toString();
    }
//    public void sorteer (){
//        Collections.sort(personenList);
//    }
}
