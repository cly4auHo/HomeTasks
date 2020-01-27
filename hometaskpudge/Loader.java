package hometaskpudge;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Loader {

    public TypeOfTranslate load(String fileName) {
        File filePath = new File(fileName);

        try (FileInputStream fis = new FileInputStream(filePath);
                ObjectInputStream ois = new ObjectInputStream(fis);) {

            return (TypeOfTranslate) ois.readObject();
        } catch (ClassNotFoundException | IOException ex) {           
            return null;
        }
    }
}
