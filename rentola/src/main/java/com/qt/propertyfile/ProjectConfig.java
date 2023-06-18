package com.qt.propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ProjectConfig {

   static Properties prop;
    static{
        prop=new Properties();
        FileInputStream file= null;
        try {
            file = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\main\\java\\resooures\\data.properties"));
            prop.load(file);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }

}
