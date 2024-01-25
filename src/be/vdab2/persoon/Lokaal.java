package be.vdab2.persoon;

import java.util.ArrayList;
import java.util.List;

public class Lokaal {
    private Trainer trainer;
    private final int nummer;

    private final List<Cursist> cursisten = new ArrayList<>();

    public Lokaal(int nummer, Trainer trainer) {
        this.trainer = trainer;
        this.nummer = nummer;
    }

    public void cursistToevoegen(Cursist cursist) {
        cursisten.add(cursist);
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append("Lokaal ")
                .append(nummer)
                .append(" ")
                .append(trainer.toString())
                .append("\n")
                .append(cursisten.size())
                .append(" cursisten :" + "\n");
        for (var cursist : cursisten) {
             builder.append
                     (cursist.toString() + " volgt "+ cursist.getTraject()+"\n");
        }
        return builder.toString();
    }
}
