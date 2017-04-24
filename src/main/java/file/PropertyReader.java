package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by vibhu on 11/18/2016.
 */
public class PropertyReader {

    Properties properties = new Properties();
    InputStream inputStream = null;
    String configFileLocation = System.getProperty("user.dir") + "\\src\\main\\resources\\configfile\\config.properties";

    public PropertyReader() {
        loadProperties();
    }

    private void loadProperties() {
        try {
            inputStream = new FileInputStream(configFileLocation);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readProperty(String key) {
        return properties.getProperty(key);
    }
}