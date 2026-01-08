package test;

import util.DBoperation;
import java.sql.Connection;

public class test2 {

    public static void main(String[] args) {
        try {
            Connection con = DBoperation.getConnection();
            System.out.println("Connection successful!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}