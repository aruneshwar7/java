package database;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.util.Properties;

public class Dbconnection {
    private static Connection connection = null;

    public Dbconnection() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                MysqlDataSource dataSource = new MysqlDataSource();
                Properties properties = new Properties();
                properties.load(Files.newInputStream(Path.of("db.properties"), StandardOpenOption.READ));
                dataSource.setServerName(properties.getProperty("serverName"));
                dataSource.setDatabaseName(properties.getProperty("dbName"));
                dataSource.setPort(Integer.parseInt(properties.getProperty("port")));
                try {
                    connection = dataSource.getConnection(properties.getProperty("username"), "");
                    System.out.println("connected");
                } catch (Exception e) {
                    System.out.println("++DBconnection++");
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return connection;
    }
}
