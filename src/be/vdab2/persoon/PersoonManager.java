package be.vdab2.persoon;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersoonManager {
    private final static Path PATH = Paths.get("/data/personen.txt");

    public void save(Personen personen) {
        try (var stream = new ObjectOutputStream(Files.newOutputStream(PATH))) {
            stream.writeObject(personen);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Personen load() {
        try {
            var stream = new ObjectInputStream(Files.newInputStream(PATH));
            return (Personen) stream.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
