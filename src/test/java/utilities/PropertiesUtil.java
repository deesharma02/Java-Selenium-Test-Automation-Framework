package utilities;

import constants.Environments;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public static String readProperty(Environments environment , String propertyName){
        File file = new File(System.getProperty("user.dir") + File.separator + "config" + File.separator + environment + ".properties");
        FileReader fileReader = null;
        Properties prop = new Properties();
        try {
            fileReader = new FileReader(file);
            prop.load(fileReader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop.getProperty(propertyName);
    }
}
