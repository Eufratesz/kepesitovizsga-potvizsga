package hu.nive.ujratervezes.io;

/*
Írd meg a hu.nive.ujratervezes.io.FileHandler osztály sumIgnoreComments() nevű metódusát. Ez egy fájlnak a relatív
elérési útvonalát várja. A fájl főként egész számokat tartalmaz.
Azonban vannak olyan sorok, melyeket nem kell feldolgozni, ezek két perjellel (//) kezdődnek. Azon számokat, melyek
előtt nincsenek perjelek, össze kell adni. Egy szám értéke maxium 10_000. Minden sor csak egy számot tartalmaz,
vagy perjelekkel kezdődően bármit.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHandler {
    public int sumIgnoreComments(String path) {
        try {
            List<String> lines = Files.readAllLines(Path.of(path));

            return sumNumbers(lines);

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file");
        }
    }

    private int sumNumbers(List<String> lines) {
        int sum = 0;
        String result = null;
        for (String line : lines) {
            if (!line.startsWith("//")) {
                sum += Integer.parseInt(line);
                if(sum >= 10_000){
                    throw new IllegalArgumentException("Mustn't be more than 10_000!");
                }
            }
        }
        return sum;
    }
}
