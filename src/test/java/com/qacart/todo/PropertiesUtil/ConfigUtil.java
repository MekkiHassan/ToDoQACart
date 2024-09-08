package com.qacart.todo.PropertiesUtil;

import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
    private Properties propertiesProduction,propertiesLocal;

    private static ConfigUtil configUtil;
    private  ConfigUtil() throws IOException {
        propertiesProduction = LoadProperties.loadPropertiesForProduction();
        propertiesLocal = LoadProperties.loadPropertiesForLocal();
    }

    public  static ConfigUtil getInstance() throws IOException {

            if(configUtil==null){
                 configUtil = new ConfigUtil();
            }
               return configUtil;
       }


    public String getUrlPro(){

        return propertiesProduction.getProperty("baseurl");
    }
    public String getEmailPro(){

        return  propertiesProduction.getProperty("email");
    }
    public String getPasswordPro()
    {
        return  propertiesProduction.getProperty("password");

    }
    public String getUrlLoca(){

        return propertiesLocal.getProperty("baseurl");
    }
    public String getEmailLocal(){

        return  propertiesLocal.getProperty("email");
    }
    public String getPasswordLocal()
    {
        return  propertiesLocal.getProperty("password");

    }



}
