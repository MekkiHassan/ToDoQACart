package com.qacart.todo.PropertiesUtil;

import java.io.*;
import java.util.Properties;

public class  LoadProperties {

    public static Properties loadPropertiesForProduction() throws IOException {
        File file = new File("src/test/java/com/qacart/todo/Config/Production.properties");
        InputStream inputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties;
    }
    public static Properties loadPropertiesForLocal() throws IOException {
        File file = new File("src/test/java/com/qacart/todo/Config/Local.properties");
        InputStream inputStream = new FileInputStream(file);
        Properties properties= new Properties();
        properties.load(inputStream);
            return properties;
    }

}
