package org.com.studies.patternsII.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    private static Connection conexao = null;

    public Connection getConnection() {
        try {
            Properties props = loadProperties();
            String url = props.getProperty("dburl");
            conexao = DriverManager.getConnection(url, props);
            return conexao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties loadProperties() {

        try (FileInputStream fs = new FileInputStream("src//main/resources/db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }


}
