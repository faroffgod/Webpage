package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBoperation
{

    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null) {
                Class.forName("org.postgresql.Driver");

                con = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/logindb",
                        "postgres",
                        "prince"
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}