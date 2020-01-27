package hometaskpudge;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Saver {
  
    public void save(TypeOfTranslate file, String fileName) {
        File filePath = new File(fileName);
              
        try (FileOutputStream fos = new FileOutputStream(filePath);
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
              
            oos.writeObject(file);
            oos.flush();
        } catch (IOException ex) {           
            Logger.getLogger(Saver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
