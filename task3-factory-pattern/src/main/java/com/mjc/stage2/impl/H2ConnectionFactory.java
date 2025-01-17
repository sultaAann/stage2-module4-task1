package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class H2ConnectionFactory implements ConnectionFactory {
    String url;


    public H2ConnectionFactory() {

    }

    @Override
    public Connection createConnection() throws SQLException {
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("./task3-factory-pattern/src/main/resources/h2database.properties")) {
            props.load(fis);
            url = props.getProperty("db_url");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return DriverManager.getConnection(url, props);
    }
}

