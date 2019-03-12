package utils;

import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {
    private Properties properties;


    public boolean readConfigFile(){
        try {

            properties = new Properties();
            Thread currentThread = Thread.currentThread();
            ClassLoader contextClassLoader = currentThread.getContextClassLoader();
            InputStream propertiesStream = contextClassLoader.getResourceAsStream("config.properties");
            if (propertiesStream != null) {
                properties.load(propertiesStream);
                propertiesStream.close();
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public String getBrowser() {
        return properties.getProperty("browsername") == null ? "" :  properties.getProperty("browsername");
    }
}
