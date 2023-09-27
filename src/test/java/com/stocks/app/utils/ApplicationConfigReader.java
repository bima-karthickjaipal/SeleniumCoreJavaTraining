package com.stocks.app.utils;

import javafx.css.CssMetaData;
import javafx.css.Styleable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ApplicationConfigReader {
    private Properties properties;
    private static ApplicationConfigReader configReader;


    public String getReportConfigPath(){
        String reportConfigPath = properties.getProperty("reportConfigPath");
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }

    // Constructor
    public ApplicationConfigReader() {
        BufferedReader reader;
        String propertyFilePath = "/Users/user/Documents/SeleniumCoreJavaTraining/src/test/resources/Configuration.properties";
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public static ApplicationConfigReader getInstance( ) {
        if(configReader == null) {
            configReader = new ApplicationConfigReader();
        }
        return configReader;
    }

    public static ApplicationConfigReader newInstance( ) {
        configReader = new ApplicationConfigReader();
        return configReader;
    }


    public ApplicationConfigReader getConfigReader() {
        configReader = new ApplicationConfigReader();
        return configReader;
    }
}
