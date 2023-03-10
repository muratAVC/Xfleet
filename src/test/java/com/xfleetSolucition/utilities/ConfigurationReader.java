package com.xfleetSolucition.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private  static Properties properties=new Properties();

    static {
        FileInputStream fileInput=null;
        try {
            fileInput=new FileInputStream("configuration.properties");
            properties.load(fileInput);
            fileInput.close();
        }catch (IOException e){

        }
    }

    public static String getProperty(String key){
       return properties.getProperty(key);
    }

}
