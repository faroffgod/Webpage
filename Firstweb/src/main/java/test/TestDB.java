package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/logindb",
                    "postgres",
                    "prince"
            );

            if (con != null) {
                System.out.println("✅ Database Connected Successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}